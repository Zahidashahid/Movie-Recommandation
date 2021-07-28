/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import DTOs.MovieDTO;
import DataAccessLayer.DataAccessLayerController;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class RecommenderEngineController 
{
    RecommenderEngineFactory objRecommenderEngineFactory;
    RecommenderEngine objRecommenderEngine;
    DataAccessLayerController objDataAccessLayerController;
    
    public RecommenderEngineController() throws SQLException
    {
        objRecommenderEngineFactory = RecommenderEngineFactory.getInstanceOfRecommenderEngineFactory();
        objDataAccessLayerController = objRecommenderEngineFactory.getInstanceOfDataAccessLayerController();
        objRecommenderEngine = objRecommenderEngineFactory.getInstanceOfRecommenderEngine();
    }
    
    public ArrayList loadAllMoviesData() throws SQLException
    {
        ArrayList<MovieDTO> list = objDataAccessLayerController.loadAllMoviesData();
        return list;
    }
    
    public ArrayList getUniqueKeywords() throws SQLException
    {
        ArrayList<MovieDTO> list = objDataAccessLayerController.getUniqueKeywords();
        return list;
    }
    
    public ArrayList getUniqueGenres() throws SQLException
    {
        ArrayList<MovieDTO> list = objDataAccessLayerController.getUniqueGenres();
        return list;
    }
    
    public ArrayList searchMovieByTitle(String title) throws SQLException
    {
        ArrayList<MovieDTO> moviesWithSimilarTitleList = objDataAccessLayerController.searchMovieByTitle(title);
        return (moviesWithSimilarTitleList);
    }
    
    //_________________________________________ 10 recent releases ________________________________________________________
    public ArrayList<MovieDTO> getTop10RecentMovies() throws SQLException
    {
        ArrayList<MovieDTO> list = objDataAccessLayerController.getTop10RecentMovies();
        return list;
    }
    
    //_________________________________________ 30 most popular releases __________________________________________________
    public ArrayList<MovieDTO> getTop30PopularMovies() throws SQLException
    {
        ArrayList<MovieDTO> list = objDataAccessLayerController.getTop30PopularMovies();
        return list;
    }
    
    //______________________ more from this writer, producer, or director (reading from database)__________________________
    
    public ArrayList<MovieDTO> getMoreMoviesForWriterOrDirectorOrProducer(int crewId, String job) throws SQLException
    {
        ArrayList<MovieDTO> list = objDataAccessLayerController.getMoreMoviesForWriterOrDirectorOrProducer(crewId, job);
        return list;
    }
    
    
    //Read from moviesrecommender 
    public ArrayList<MovieDTO> getMoreMoviesForProducer(MovieDTO movie) throws SQLException
    {
        ArrayList<MovieDTO> list = objRecommenderEngine.getMoreMoviesForProducer(movie);
        return list;
    }
    
    public ArrayList<MovieDTO> getMoreMoviesForWriter(MovieDTO movie) throws SQLException
    {
        ArrayList<MovieDTO> list = objRecommenderEngine.getMoreMoviesForWriter(movie);
        return list;
    }
    
    public ArrayList<MovieDTO> getMoreMoviesForDirector(MovieDTO movie) throws SQLException
    {
        ArrayList<MovieDTO> list = objRecommenderEngine.getMoreMoviesForDirector(movie);
        return list;
    }
    
    public ArrayList<MovieDTO> recommendSimilarMovies(MovieDTO selectedMovie, boolean popularityFilter) throws SQLException, IOException
    {
        ArrayList<MovieDTO> list = objRecommenderEngine.recommendSimilarMovies(selectedMovie, popularityFilter);
        return list;
    }

}
