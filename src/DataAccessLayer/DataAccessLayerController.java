/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DTOs.MovieDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataAccessLayerController 
{
    DatabaseFactory objDatabaseFactory = DatabaseFactory.getInstanceOfDatabaseFactory();
    QueryProcessor objQueryProcessor = objDatabaseFactory.getInstanceOfQueryProcessor();
    
    public ArrayList loadAllMoviesData() throws SQLException
    {
        ArrayList<MovieDTO> list = objQueryProcessor.loadDataFromMovies();
        return list;
    }
    
    public ArrayList getUniqueKeywords() throws SQLException
    {
        ArrayList<MovieDTO> list = objQueryProcessor.loadDataFromKeywords();
        return list;
    }
    
    public ArrayList getUniqueGenres() throws SQLException
    {
        ArrayList<MovieDTO> list = objQueryProcessor.loadDataFromGenres();
        return list;
    }
    
    public ArrayList searchMovieByTitle(String title) throws SQLException
    {
        ArrayList<MovieDTO> moviesWithSimilarTitleList = objQueryProcessor.searchMovieByTitle(title);
        return (moviesWithSimilarTitleList);
    }

    public ArrayList<MovieDTO> getTop10RecentMovies() throws SQLException {
        ArrayList<MovieDTO> list = objQueryProcessor.get10RecentMovies();
        return (list);
    }

    public ArrayList<MovieDTO> getTop30PopularMovies() throws SQLException {
        ArrayList<MovieDTO> list = objQueryProcessor.get30PopularMovies();
        return (list);
    }
    
    //_________________________ more from this writer, director or producer _______________________________________
    
    public ArrayList<MovieDTO> getMoreMoviesForWriterOrDirectorOrProducer(int crewId, String job) throws SQLException
    {
        ArrayList<MovieDTO> list = objQueryProcessor.getMoreMoviesForWriterOrDirectorOrProducer(crewId, job);
        return list;
    }
}