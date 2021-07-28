/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import DTOs.MovieDTO;
import DataAccessLayer.DataAccessLayerController;
import Objects.RecommendedMovie;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;


public class RecommenderEngine 
{
    RecommenderEngineFactory objRecommenderEngineFactory;
    DataAccessLayerController  objDataAccessLayerController ;
    ArrayList<String> keywords;
    ArrayList<String> genres; 
    ArrayList<MovieDTO> moviesList;
            
    public RecommenderEngine() throws SQLException
    {
        objRecommenderEngineFactory = RecommenderEngineFactory.getInstanceOfRecommenderEngineFactory();
        objDataAccessLayerController  = objRecommenderEngineFactory.getInstanceOfDataAccessLayerController ();
        keywords = objDataAccessLayerController .getUniqueKeywords();
        genres = objDataAccessLayerController .getUniqueGenres();
        moviesList = objDataAccessLayerController .loadAllMoviesData();
    }
    
    public ArrayList getUniqueKeywords() throws IOException, SQLException
    {
        return(keywords);
    }
    
    public ArrayList getUniqueGenres() throws IOException, SQLException
    {
        return(genres);
    }
       
    public int[][] generateMatrix() throws IOException, SQLException
    {
        int[][] matrix = new int[moviesList.size()][genres.size() + keywords.size()];

        for(int i = 0; i < moviesList.size(); i++)
        {    
            int k = -1;
            boolean matchFound;
            
            for(int j = 0; j < genres.size(); j++)
            {   
                matchFound = false;
                for(int g = 0; g < moviesList.get(i).genreList.size(); g++)
                {
                    if(moviesList.get(i).genreList.get(g).name.equals(genres.get(j)))
                    {
                        matchFound = true;
                        break;
                    }
                }
                
                if(matchFound)
                {
                    k++;
                    matrix[i][k] = 1;
                }
                else
                {
                    k++;
                    matrix[i][k] = 0;
                }
            }  
            
            for(int j = 0; j < keywords.size(); j++)
            {
                matchFound = false;
                for(int g = 0; g < moviesList.get(i).keywordList.size(); g++)
                {
                    if(moviesList.get(i).keywordList.get(g).name.equals(keywords.get(j)))
                    {
                        matchFound = true;
                        break;
                    }
                }
                
                if(matchFound)
                {
                    k++;
                    matrix[i][k] = 1;
                }
                else
                {
                    k++;
                    matrix[i][k] = 0;
                }
            }
        } 
        
        return matrix;
    }
 
    //_________________________________________similar movies __________________________________________________________
    public ArrayList recommendSimilarMovies(MovieDTO selectedMovie, boolean popularityFilter) throws IOException, SQLException
    {
        ArrayList<RecommendedMovie> list = objRecommenderEngineFactory.getInstanceOfRecommendedMovieList();
        ArrayList<MovieDTO> filteredMoviesList = objRecommenderEngineFactory.getInstanceOfMovieDTOList();
        ArrayList<RecommendedMovie> top10FilteredMoviesList = objRecommenderEngineFactory.getInstanceOfRecommendedMovieList();;

        
        for(int i = 0; i < moviesList.size(); i++)
        {
            if(selectedMovie.movieId == moviesList.get(i).movieId)
            {
                selectedMovie = moviesList.get(i);
                break;
            }
        }

        int[][] matrix = generateMatrix();
        for(int i = 0; i < moviesList.size(); i++)
        {
            int matchScore = 0;
            if(moviesList.get(i) != selectedMovie)
            {
                for(int j = 0; j < (genres.size() + keywords.size()); j++)
                {
                    if((matrix[moviesList.indexOf(selectedMovie)][j] == 1)  && (matrix[i][j] == 1))
                    {
                        matchScore++;
                    }
                }
                //if movie has 0 matchScore then donot store that movie
                if(matchScore != 0)
                {
                    RecommendedMovie objRecommendedMovie = new RecommendedMovie();
                    objRecommendedMovie.movie = moviesList.get(i);
                    objRecommendedMovie.matchScore = matchScore;
                    list.add(objRecommendedMovie);
                }
            }
        }
        
        if(list.size() <= 5)
        {
            for(int i = 0; i < list.size(); i++)
            {
                filteredMoviesList.add(list.get(i).movie);
            }
        }
        else
        {    
            Collections.sort(list);
            
            //now select the top 10 similar movies from the  sorted list
            
            if(list.size() >= 10)
            {
                for(int i = 0; i < 10; i++)
                {
                    top10FilteredMoviesList.add(list.get(i));
                }
                filteredMoviesList = getTop5SimilarMovies(top10FilteredMoviesList, popularityFilter);
            }
            else
            {
                filteredMoviesList = getTop5SimilarMovies(list, popularityFilter);
            }
        }
        
        return filteredMoviesList;
    }
    
    //_________________________________________top 5 similar__________________________________________________________
    
    ArrayList<MovieDTO> getTop5SimilarMovies(ArrayList<RecommendedMovie> list, boolean popularityFilter)
    {
        ArrayList<MovieDTO> filteredList = new ArrayList<>();
        ArrayList<MovieDTO> top5FilteredMoviesList = new ArrayList<>();
        
        if(popularityFilter)
        {
            int maxVoteCount = 0;
            for(int i = 0; i < list.size(); i++)
            {
                if(list.get(i).movie.voteCount > maxVoteCount)
                {
                    maxVoteCount = list.get(i).movie.voteCount;
                }
            }

            //calculate popularity for the movies
            for(int i = 0; i < list.size(); i++)
            {
                list.get(i).popularityScore = (((list.get(i).movie.popularity * list.get(i).movie.popularity) * (list.get(i).movie.voteCount) / maxVoteCount));
            }

            //calculate average popularity for the movies
            double averagePopularityScore = 0;
            double sum = 0;
            for(int i = 0; i < list.size(); i++)
            {
                sum += list.get(i).popularityScore;
            }
            averagePopularityScore = (sum / list.size());

            for(int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i).movie.title + "    "+ list.get(i).matchScore
                       +  "      " + list.get(i).popularityScore);
                if(list.get(i).popularityScore >= (averagePopularityScore / 4))
                {
                    filteredList.add(list.get(i).movie);
                }
            }
        }
        else
        {           
            for(int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i).movie.title + "    "+ list.get(i).matchScore);
                filteredList.add(list.get(i).movie);
            }
        
        }
        
        //select top 5 movies
        if(filteredList.size() <= 5)
        {
            for(int i = 0; i < filteredList.size(); i++)
            {
                top5FilteredMoviesList.add(filteredList.get(i));
            }
        }
        else
        {
            for(int i = 0; i < 5; i++)
            {
                top5FilteredMoviesList.add(filteredList.get(i));
            }
        }
        
        return top5FilteredMoviesList;
    }

        
    //_______________________________________ more from this writer _____________________________________________
    
    public ArrayList<MovieDTO> getMoreMoviesForWriter(MovieDTO movie) throws SQLException
    {
        ArrayList<MovieDTO> list = objRecommenderEngineFactory.getInstanceOfMovieDTOList();
        ArrayList<MovieDTO> filteredList = objRecommenderEngineFactory.getInstanceOfMovieDTOList();
        
        for(int i = 0; i < movie.crewList.size(); i++)
        {
            if("Writer".equals(movie.crewList.get(i).job) || "Screenplay".equals(movie.crewList.get(i).job))
            {
                list.addAll(objDataAccessLayerController.getMoreMoviesForWriterOrDirectorOrProducer(movie.crewList.get(i).id, movie.crewList.get(i).job));
            }
        }
        
        for(int i = 0; i < list.size(); i++)
        {
            boolean found = false;
            
            for(int j = 0; j < filteredList.size(); j++)
            {
                if((list.get(i).movieId == filteredList.get(j).movieId))
                {
                    found = true;
                    break;
                }
            }
                
            if(!found)
            {
                if((list.get(i).movieId != movie.movieId))
                {
                    filteredList.add(list.get(i));
                }
            }
        
        }
        
        return filteredList;
    }
    
    //_______________________________________ more from this director _____________________________________________
    
    public ArrayList<MovieDTO> getMoreMoviesForDirector(MovieDTO movie) throws SQLException
    {
        ArrayList<MovieDTO> list = objRecommenderEngineFactory.getInstanceOfMovieDTOList();
        ArrayList<MovieDTO> filteredList = objRecommenderEngineFactory.getInstanceOfMovieDTOList();
        for(int i = 0; i < movie.crewList.size(); i++)
        {
            if("Director".equals(movie.crewList.get(i).job))
            {
                list.addAll(objDataAccessLayerController.getMoreMoviesForWriterOrDirectorOrProducer(movie.crewList.get(i).id, movie.crewList.get(i).job));
            }
        }
        
        for(int i = 0; i < list.size(); i++)
        {
           
            boolean found = false;
            
            for(int j = 0; j < filteredList.size(); j++)
            {
                if((list.get(i).movieId == filteredList.get(j).movieId))
                {
                    found = true;
                    break;
                }
            }
                
            if(!found)
            {
                if((list.get(i).movieId != movie.movieId))
                {
                    filteredList.add(list.get(i));
                }
            }
        
        }
        
        return filteredList;
    }
    
    //_______________________________________ more from this producer _____________________________________________
    
    public ArrayList<MovieDTO> getMoreMoviesForProducer(MovieDTO movie) throws SQLException
    {
        ArrayList<MovieDTO> list = objRecommenderEngineFactory.getInstanceOfMovieDTOList();
        ArrayList<MovieDTO> filteredList = objRecommenderEngineFactory.getInstanceOfMovieDTOList();
        
        for(int i = 0; i < movie.crewList.size(); i++)
        {
            if("Producer".equals(movie.crewList.get(i).job) || "Executive Producer".equals(movie.crewList.get(i).job))
            {
                list.addAll(objDataAccessLayerController .getMoreMoviesForWriterOrDirectorOrProducer(movie.crewList.get(i).id, movie.crewList.get(i).job));
            }
        }
              
        for(int i = 0; i < list.size(); i++)
        {
           
            boolean found = false;
            
            for(int j = 0; j < filteredList.size(); j++)
            {
                if((list.get(i).movieId == filteredList.get(j).movieId))
                {
                    found = true;
                    break;
                }
            }
                
            if(!found)
            {
                if((list.get(i).movieId != movie.movieId))
                {
                    filteredList.add(list.get(i));
                }
            }
        
        }
        
        return filteredList;
    }
}
