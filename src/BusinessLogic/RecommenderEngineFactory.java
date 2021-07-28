/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import DTOs.MovieDTO;
import DataAccessLayer.DataAccessLayerController;
import Objects.Cast;
import Objects.Crew;
import Objects.Genre;
import Objects.Keyword;
import Objects.RecommendedMovie;
import java.sql.SQLException;
import java.util.ArrayList;


public class RecommenderEngineFactory 
{
    static public RecommenderEngineFactory getInstanceOfRecommenderEngineFactory()
    {
        return(new RecommenderEngineFactory());
    }
    
    public ArrayList<MovieDTO> getInstanceOfMovieDTOList()
    {
        return(new ArrayList<MovieDTO>());
    }
    
    public MovieDTO getInstanceOfMovieDTO()
    {
        return(new MovieDTO());
    }    
    
    public RecommenderEngineController getInstanceOfRecommenderEngineController() throws SQLException
    {
        return(new RecommenderEngineController());
    }
    
    public DataAccessLayerController getInstanceOfDataAccessLayerController()
    {
        return(new DataAccessLayerController());
    }
    
    public RecommenderEngine getInstanceOfRecommenderEngine() throws SQLException
    {
        return(new RecommenderEngine());
    }

    
    public ArrayList<String> getInstanceOfStringList()
    {
        return(new ArrayList<>());
    }
    
    public ArrayList<Integer> getInstanceOfIntegerList()
    {
        return(new ArrayList<>());
    }
    
    public Keyword getInstanceOfKeyword(int id, String name)
    {
        return(new Keyword(id, name));
    }
    
    public Genre getInstanceOfGenre(int id, String name)
    {
        return(new Genre(id, name));
    }
    
    public ArrayList<Keyword> getInstanceOfKeywordList()
    {
        return(new ArrayList<>());
    }
    
    public ArrayList<Genre> getInstanceOfGenreList()
    {
        return(new ArrayList<>());
    }
    
    public ArrayList<Cast> getInstanceOfCastList()
    {
        return(new ArrayList<>());
    }
    
    public ArrayList<Crew> getInstanceOfCrewList()
    {
        return(new ArrayList<>());
    }
    
    public Cast getInstanceOfCast(int id, String name, String character)
    {
        return(new Cast(id, name, character));
    }
    
    public Crew getInstanceOfCrew(int id, String name, String job)
    {
        return(new Crew(id, name, job));
    }
    
    public RecommendedMovie getInstanceOfRecommendedMovie()
    {
        return(new RecommendedMovie());
    }
        
    public ArrayList<RecommendedMovie> getInstanceOfRecommendedMovieList()
    {
        return(new ArrayList<>());
    }
}
