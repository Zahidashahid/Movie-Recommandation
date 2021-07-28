/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import Objects.Cast;
import Objects.Crew;
import Objects.Genre;
import Objects.Keyword;
import java.util.ArrayList;


public class MovieDTO {
    public int movieId;
    public String title;
    public int budget;
    public String homepage;

    public String originalLanguage;
    public String overview;
    public double popularity;
    public String releaseDate;
    public int runtime;
    public String tagline;
    public double voteAverage;
    public int voteCount;
    
    public ArrayList<Genre> genreList = new ArrayList<>();
    public ArrayList<Keyword> keywordList = new ArrayList<>();
    public ArrayList<Cast> castList = new ArrayList<>();
    public ArrayList<Crew> crewList = new ArrayList<>();
    
    public MovieDTO()
    {}
    
    MovieDTO(int movieId, String title, int budget, String homepage,  
            String originalLanguage, String overview, double popularity, String releaseDate, 
            int runtime, String tagline, double voteAverage, int voteCount,
            ArrayList<Genre> genreList, ArrayList<Keyword> keywordList,
            ArrayList<Cast> castList, ArrayList<Crew> crewList)
    {
        this.movieId = movieId;
        this.title = title;
        this.budget = budget;
        this.homepage = homepage;
        this.originalLanguage = originalLanguage;
        this.overview = overview;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
        this.tagline = tagline;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;

        this.genreList = genreList;
        this.keywordList = keywordList;
        this.castList = castList;
        this.crewList = crewList;
    }

}
