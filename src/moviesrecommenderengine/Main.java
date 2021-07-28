/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesrecommenderengine;


import UI.MovieViewer;
import java.sql.SQLException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException 
    {
        // TODO code application logic here
// 
//        Home objHome = new Home();
//        objHome.setVisible(true);
//        objHome.getRecentAndPopularMovies();
        MovieViewer objMovieViewer = new MovieViewer();
        objMovieViewer.setVisible(true);
    }
  
}
