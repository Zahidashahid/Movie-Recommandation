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
import java.util.ArrayList;

public class DatabaseFactory {
    
    static public DatabaseFactory getInstanceOfDatabaseFactory()
    {
        return(new DatabaseFactory());
    }
    
    public DatabaseConnection getInstanceOfDatabaseConnection()
    {
        return(new DatabaseConnection());
    }
    
    public QueryProcessor getInstanceOfQueryProcessor()
    {
        return(new QueryProcessor());
    }
    
    public ArrayList<MovieDTO> getInstanceOfMovieDTOList()
    {
        return(new ArrayList<>());
    }
    
    public ArrayList<String> getInstanceOfStringList()
    {
        return(new ArrayList<>());
    }
    
    public MovieDTO getInstanceOfMovieDTO()
    {
        return(new MovieDTO());
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

}
