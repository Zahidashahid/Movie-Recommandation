/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

public class Movie {
    public int movieId;
    public String title;
    public int budget;
    public String originalLanguage;
    public String overview;
    public double popularity;
    public String releaseDate;
    public int runtime;
    public String tagline;
    public double voteAverage;
    public int voteCount;
    public String homepage;
    
    public ArrayList<Genre> genreList = new ArrayList<>();
    public ArrayList<Keyword> keywordList = new ArrayList<>();
    
    public ArrayList<Cast> castList = new ArrayList<>();
    public ArrayList<Crew> crewList = new ArrayList<>();
}
