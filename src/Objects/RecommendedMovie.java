/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import DTOs.MovieDTO;
import static java.lang.Integer.parseInt;


public class RecommendedMovie implements Comparable<RecommendedMovie>{
    public MovieDTO movie;
    public int matchScore;
    public double popularityScore;
    
    @Override
    public int compareTo(RecommendedMovie comparestu) {
        int compareage=((RecommendedMovie)comparestu).matchScore;
        /* For Ascending order*/
        //return this.matchScore-compareage;

        /* For Descending order do like this */
        return compareage-this.matchScore;
    }
}
