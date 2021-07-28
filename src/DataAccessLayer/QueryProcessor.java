/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DTOs.MovieDTO;
import Objects.Cast;
import Objects.Crew;
import Objects.Genre;
import Objects.Keyword;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QueryProcessor 
{       
    DatabaseFactory objDatabaseFactory;
    DatabaseConnection objDatabaseConnection;
    Connection objConnection;
        
    QueryProcessor ()
    {
        objDatabaseFactory = DatabaseFactory.getInstanceOfDatabaseFactory();
        objDatabaseConnection = objDatabaseFactory.getInstanceOfDatabaseConnection();
        objConnection =  objDatabaseConnection.getDatabaseConnection();
    
    }

    
    //_______________________________________________________________________________________________________________
    
    ArrayList loadDataFromGenres() throws SQLException
    {
        ResultSet rs = null;
        ArrayList<String> uniqueGenresList = objDatabaseFactory.getInstanceOfStringList();
        
        try
        {
            Statement objStatement = objConnection.createStatement();
            String query = "Select genre_name from genres";
            
            rs = objStatement.executeQuery(query);
            while(rs!=null)
            {
                rs.next();
                uniqueGenresList.add(rs.getString("genre_name")); 
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        }
        return uniqueGenresList;
    }
    
    
    
    //_______________________________________________________________________________________________________________
    
    ArrayList loadDataFromKeywords() throws SQLException
    {
        ResultSet rs = null;
        ArrayList<String> uniqueKeywordsList = objDatabaseFactory.getInstanceOfStringList();
        
        try
        {
            Statement objStatement = objConnection.createStatement();
            String query = "Select keyword_name from keywords";
            
            rs = objStatement.executeQuery(query);
            while(rs!=null)
            {
                rs.next();
                uniqueKeywordsList.add(rs.getString("keyword_name")); 
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        }
        return uniqueKeywordsList;
    }
    
    //_______________________________________________________________________________________________________________
    
    ArrayList loadDataFromMovies() throws SQLException
    {
        ResultSet rs = null;
        ArrayList<MovieDTO> moviesList = objDatabaseFactory.getInstanceOfMovieDTOList();
        
        try
        {
            Statement objStatement = objConnection.createStatement();
            String query = "Select * from movies";
            
            rs = objStatement.executeQuery(query);
            while(rs!=null)
            {
                rs.next();
                MovieDTO objMovieDTO = objDatabaseFactory.getInstanceOfMovieDTO();
                objMovieDTO.movieId = rs.getInt("movie_id");
                objMovieDTO.title = rs.getString("title");
                objMovieDTO.overview = rs.getString("overview");
                objMovieDTO.tagline = rs.getString("tagline");
                objMovieDTO.releaseDate = rs.getString("release_date");
                objMovieDTO.budget = parseInt(rs.getString("budget"));
                objMovieDTO.originalLanguage = rs.getString("original_language");
                objMovieDTO.runtime = parseInt(rs.getString("runtime"));
                objMovieDTO.popularity = parseDouble(rs.getString("popularity"));
                objMovieDTO.voteCount = parseInt(rs.getString("vote_count"));
                objMovieDTO.voteAverage = parseDouble(rs.getString("vote_average"));
                objMovieDTO.homepage = rs.getString("homepage");
                   
                //get genre and keywords for current movie
                objMovieDTO.keywordList = getKeywordsForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.genreList = getGenresForGivenMovie(objMovieDTO.movieId);
                
                //get cast and crew for current movie
                objMovieDTO.castList = getCastForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.crewList = getCrewForGivenMovie(objMovieDTO.movieId);
                
                moviesList.add(objMovieDTO); 
            }
            
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        }
        
        return moviesList;
    }
    
    //_______________________________________________________________________________________________________________
    
    ArrayList<Keyword> getKeywordsForGivenMovie(int movieId)
    {
        ResultSet rs = null;
        ArrayList<Keyword> keywordList = objDatabaseFactory.getInstanceOfKeywordList();
        Keyword objKeyword;
        try
        {
            Statement objStatement = objConnection.createStatement();
            String query = "Select keyword_id, keyword_name from movies join movies_keywords "
            + "using(movie_id) join keywords using(keyword_id) where movie_id=" + movieId;
            rs = objStatement.executeQuery(query);      
            while(rs!=null)
            {
                rs.next();
                //get genre for current movie
                objKeyword = objDatabaseFactory.getInstanceOfKeyword(rs.getInt("keyword_id"), rs.getString("keyword_name"));
                keywordList.add(objKeyword); 
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
        return keywordList;
    }
    
    //_______________________________________________________________________________________________________________
    
    ArrayList<Genre> getGenresForGivenMovie(int movieId) throws SQLException
    {
        Statement objStatement = objConnection.createStatement(); 
        ResultSet rs = null;
        ArrayList<Genre> genreList = objDatabaseFactory.getInstanceOfGenreList();
        Genre objGenre;
        try
        {
            String query = "Select genre_id, genre_name from movies join movies_genres "
            + "using(movie_id) join genres using(genre_id) where movie_id=" + movieId;
            rs = objStatement.executeQuery(query);      
            while(rs!=null)
            {
                rs.next();
                //get genre for current movie
                objGenre = objDatabaseFactory.getInstanceOfGenre(rs.getInt("genre_id"), rs.getString("genre_name"));
                genreList.add(objGenre); 
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
        return genreList;
    }
    
    //_______________________________________________________________________________________________________________
    
    ArrayList<Cast> getCastForGivenMovie(int movieId) throws SQLException
    {
        Statement objStatement = objConnection.createStatement(); 
        ResultSet rs = null;
        ArrayList<Cast> castList = objDatabaseFactory.getInstanceOfCastList();
        Cast objCast;
        try
        {
            String query = "Select id, name, character from cast where movie_id=" + movieId;
            rs = objStatement.executeQuery(query);      
            while(rs!=null)
            {
                rs.next();
                //get cast for current movie
                objCast = objDatabaseFactory.getInstanceOfCast(rs.getInt("id"), rs.getString("name"), rs.getString("character"));
                castList.add(objCast); 
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
        return castList;
    }
    
    ArrayList<Crew> getCrewForGivenMovie(int movieId) throws SQLException
    {
        Statement objStatement = objConnection.createStatement(); 
        ResultSet rs = null;
        ArrayList<Crew> crewList = objDatabaseFactory.getInstanceOfCrewList();
        Crew objCrew;
        try
        {
            String query = "Select id, name, job from crew where movie_id=" + movieId;
            rs = objStatement.executeQuery(query);      
            while(rs!=null)
            {
                rs.next();
                //get cast for current movie
                objCrew = objDatabaseFactory.getInstanceOfCrew(rs.getInt("id"), rs.getString("name"), rs.getString("job"));
                crewList.add(objCrew); 
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
        return crewList;
    }
    
    //_______________________________________________________________________________________________________________
    
   ArrayList searchMovieByTitle(String title) throws SQLException
    {
        Statement objStatement = objConnection.createStatement(); 
        ResultSet rs = null;
        ArrayList<MovieDTO> moviesWithSimilarTitleList = objDatabaseFactory.getInstanceOfMovieDTOList();
         
        try
        {
            String query = "Select * from movies where lower(title) like lower('%" + title + "%')";
            rs = objStatement.executeQuery(query); 
            
            while(rs!=null)
            {
                rs.next();
                MovieDTO objMovieDTO = objDatabaseFactory.getInstanceOfMovieDTO();
                objMovieDTO.movieId = rs.getInt("movie_id");
                objMovieDTO.title = rs.getString("title");
                objMovieDTO.overview = rs.getString("overview");
                objMovieDTO.tagline = rs.getString("tagline");
                objMovieDTO.releaseDate = rs.getString("release_date");
                objMovieDTO.budget = parseInt(rs.getString("budget"));
                objMovieDTO.originalLanguage = rs.getString("original_language");
                objMovieDTO.runtime = parseInt(rs.getString("runtime"));
                objMovieDTO.popularity = parseDouble(rs.getString("popularity"));
                objMovieDTO.voteCount = parseInt(rs.getString("vote_count"));
                objMovieDTO.voteAverage = parseDouble(rs.getString("vote_average"));
                objMovieDTO.homepage = rs.getString("homepage");
                
                //get genre, keywords for current movie
                objMovieDTO.keywordList = getKeywordsForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.genreList = getGenresForGivenMovie(objMovieDTO.movieId);
                
                
                //get cast, crew for current movie
                objMovieDTO.castList = getCastForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.crewList = getCrewForGivenMovie(objMovieDTO.movieId);
                
                moviesWithSimilarTitleList.add(objMovieDTO);
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
        return moviesWithSimilarTitleList;
    }
    //_______________________________________________________________________________________________________________
   
    ArrayList<MovieDTO> get10RecentMovies() throws SQLException
    {
        Statement objStatement = objConnection.createStatement(); 
        ResultSet rs = null;
        ArrayList<MovieDTO> top10RecentMoviesList = objDatabaseFactory.getInstanceOfMovieDTOList();
         
        try
        {
            String query = "Select * from (Select * from movies order by release_date desc) where rownum <= 10";
            rs = objStatement.executeQuery(query); 
            
            while(rs!=null)
            {
                rs.next();
                
                MovieDTO objMovieDTO = objDatabaseFactory.getInstanceOfMovieDTO();
                objMovieDTO.movieId = rs.getInt("movie_id");
                objMovieDTO.title = rs.getString("title");
                objMovieDTO.overview = rs.getString("overview");
                objMovieDTO.tagline = rs.getString("tagline");
                objMovieDTO.releaseDate = rs.getString("release_date");
                objMovieDTO.budget = parseInt(rs.getString("budget"));
                objMovieDTO.originalLanguage = rs.getString("original_language");
                objMovieDTO.runtime = parseInt(rs.getString("runtime"));
                objMovieDTO.popularity = parseDouble(rs.getString("popularity"));
                objMovieDTO.voteCount = parseInt(rs.getString("vote_count"));
                objMovieDTO.voteAverage = parseDouble(rs.getString("vote_average"));
                objMovieDTO.homepage = rs.getString("homepage");
                
                //get genre, keywords for current movie
                objMovieDTO.keywordList = getKeywordsForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.genreList = getGenresForGivenMovie(objMovieDTO.movieId);
                
                
                //get cast, crew for current movie
                objMovieDTO.castList = getCastForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.crewList = getCrewForGivenMovie(objMovieDTO.movieId);
                
                top10RecentMoviesList.add(objMovieDTO);
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
        return top10RecentMoviesList;
    
    }

    //_______________________________________________________________________________________________________________
    
    ArrayList<MovieDTO> get30PopularMovies() throws SQLException
    {
        Statement objStatement = objConnection.createStatement(); 
        ResultSet rs = null;
        ArrayList<MovieDTO> top30PopularMoviesList = objDatabaseFactory.getInstanceOfMovieDTOList();
         
        try
        {
            String query = "Select * from (Select * from movies order by vote_count desc) where rownum <= 10";
            rs = objStatement.executeQuery(query); 
            
            while(rs!=null)
            {   
                rs.next();            
                MovieDTO objMovieDTO = objDatabaseFactory.getInstanceOfMovieDTO();
                objMovieDTO.movieId = rs.getInt("movie_id");
                objMovieDTO.title = rs.getString("title");
                objMovieDTO.overview = rs.getString("overview");
                objMovieDTO.tagline = rs.getString("tagline");
                objMovieDTO.releaseDate = rs.getString("release_date");
                objMovieDTO.budget = parseInt(rs.getString("budget"));
                objMovieDTO.originalLanguage = rs.getString("original_language");
                objMovieDTO.runtime = parseInt(rs.getString("runtime"));
                objMovieDTO.popularity = parseDouble(rs.getString("popularity"));
                objMovieDTO.voteCount = parseInt(rs.getString("vote_count"));
                objMovieDTO.voteAverage = parseDouble(rs.getString("vote_average"));
                objMovieDTO.homepage = rs.getString("homepage");
                
                //get genre, keywords for current movie
                objMovieDTO.keywordList = getKeywordsForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.genreList = getGenresForGivenMovie(objMovieDTO.movieId);
                
                
                //get cast, crew for current movie
                objMovieDTO.castList = getCastForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.crewList = getCrewForGivenMovie(objMovieDTO.movieId);
                
                top30PopularMoviesList.add(objMovieDTO);
            }
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
        
        try
        {
            String query = "Select * from (Select * from movies order by vote_average desc) where rownum <= 10";
            rs = objStatement.executeQuery(query); 
            
            while(rs!=null)
            {
                rs.next();
                MovieDTO objMovieDTO = objDatabaseFactory.getInstanceOfMovieDTO();
                objMovieDTO.movieId = rs.getInt("movie_id");
                objMovieDTO.title = rs.getString("title");
                objMovieDTO.overview = rs.getString("overview");
                objMovieDTO.tagline = rs.getString("tagline");
                objMovieDTO.releaseDate = rs.getString("release_date");
                objMovieDTO.budget = parseInt(rs.getString("budget"));
                objMovieDTO.originalLanguage = rs.getString("original_language");
                objMovieDTO.runtime = parseInt(rs.getString("runtime"));
                objMovieDTO.popularity = parseDouble(rs.getString("popularity"));
                objMovieDTO.voteCount = parseInt(rs.getString("vote_count"));
                objMovieDTO.voteAverage = parseDouble(rs.getString("vote_average"));
                objMovieDTO.homepage = rs.getString("homepage");
                
                //get genre, keywords for current movie
                objMovieDTO.keywordList = getKeywordsForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.genreList = getGenresForGivenMovie(objMovieDTO.movieId);
                
                
                //get cast, crew for current movie
                objMovieDTO.castList = getCastForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.crewList = getCrewForGivenMovie(objMovieDTO.movieId);
                
                boolean found = false;
                for(int i = 0; i < top30PopularMoviesList.size(); i++)
                {
                    if(top30PopularMoviesList.get(i).movieId == objMovieDTO.movieId)
                    {
                        found = true;
                        break;
                    }
                }
                
                if(!found)
                {
                    top30PopularMoviesList.add(objMovieDTO);
                }
            }
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
                
        try
        {
            String query = "Select * from (Select * from movies order by popularity desc) where rownum <= 10";
            rs = objStatement.executeQuery(query); 
            
            while(rs!=null)
            {
                rs.next();
                MovieDTO objMovieDTO = objDatabaseFactory.getInstanceOfMovieDTO();
                objMovieDTO.movieId = rs.getInt("movie_id");
                objMovieDTO.title = rs.getString("title");
                objMovieDTO.overview = rs.getString("overview");
                objMovieDTO.tagline = rs.getString("tagline");
                objMovieDTO.releaseDate = rs.getString("release_date");
                objMovieDTO.budget = parseInt(rs.getString("budget"));
                objMovieDTO.originalLanguage = rs.getString("original_language");
                objMovieDTO.runtime = parseInt(rs.getString("runtime"));
                objMovieDTO.popularity = parseDouble(rs.getString("popularity"));
                objMovieDTO.voteCount = parseInt(rs.getString("vote_count"));
                objMovieDTO.voteAverage = parseDouble(rs.getString("vote_average"));
                objMovieDTO.homepage = rs.getString("homepage");
                
                //get genre, keywords for current movie
                objMovieDTO.keywordList = getKeywordsForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.genreList = getGenresForGivenMovie(objMovieDTO.movieId);
                
                
                //get cast, crew for current movie
                objMovieDTO.castList = getCastForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.crewList = getCrewForGivenMovie(objMovieDTO.movieId);
                
                boolean found = false;
                for(int i = 0; i < top30PopularMoviesList.size(); i++)
                {
                    if(top30PopularMoviesList.get(i).movieId == objMovieDTO.movieId)
                    {
                        found = true;
                        break;
                    }
                }
                
                if(!found)
                {
                    top30PopularMoviesList.add(objMovieDTO);
                }
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        } 
                        
        return top30PopularMoviesList;
    }
    
    
   //__________________________________more from this writer, director or writer _______________________________________
    
    public ArrayList<MovieDTO> getMoreMoviesForWriterOrDirectorOrProducer(int Id, String job) throws SQLException
    {
        Statement objStatement = objConnection.createStatement(); 
        ResultSet rs = null;
        ArrayList<MovieDTO> moviesForSelectedWriter = objDatabaseFactory.getInstanceOfMovieDTOList();    
        try
        {
            String query = "Select * from movies join crew using(movie_id) "
                    + "where id = " + Id + " and lower(job) = '" + job.toLowerCase() + "'";
            rs = objStatement.executeQuery(query); 
            
            while(rs!=null)
            {
                rs.next();
                
                MovieDTO objMovieDTO = objDatabaseFactory.getInstanceOfMovieDTO();
                objMovieDTO.movieId = rs.getInt("movie_id");
                objMovieDTO.title = rs.getString("title");
                objMovieDTO.overview = rs.getString("overview");
                objMovieDTO.tagline = rs.getString("tagline");
                objMovieDTO.releaseDate = rs.getString("release_date");
                objMovieDTO.budget = parseInt(rs.getString("budget"));
                objMovieDTO.originalLanguage = rs.getString("original_language");
                objMovieDTO.runtime = parseInt(rs.getString("runtime"));
                objMovieDTO.popularity = parseDouble(rs.getString("popularity"));
                objMovieDTO.voteCount = parseInt(rs.getString("vote_count"));
                objMovieDTO.voteAverage = parseDouble(rs.getString("vote_average"));
                objMovieDTO.homepage = rs.getString("homepage");
                
                //get genre, keywords for current movie
                objMovieDTO.keywordList = getKeywordsForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.genreList = getGenresForGivenMovie(objMovieDTO.movieId);
                
                
                //get cast, crew for current movie
                objMovieDTO.castList = getCastForGivenMovie(objMovieDTO.movieId);
                objMovieDTO.crewList = getCrewForGivenMovie(objMovieDTO.movieId);
                
                boolean found = false;
                for(int i = 0; i <moviesForSelectedWriter.size(); i++)
                {
                    if(moviesForSelectedWriter.get(i).movieId == objMovieDTO.movieId)
                    {
                        found = true;
                        break;
                    }
                }
                
                if(!found)
                {
                    moviesForSelectedWriter.add(objMovieDTO);
                }
                
            }
            objConnection.close();
        }
        catch(SQLException e)
        {
//            System.out.println(e);
        } 
                        
        return moviesForSelectedWriter;
    }

}