/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection getDatabaseConnection(){
        Connection con = null;
        String connectionUrl = "jdbc:oracle:thin:@//localhost:1521/moviesRecommender";
        try 
        {
            con = DriverManager.getConnection(connectionUrl, "java", "java");
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) 
        {
           e.printStackTrace();
        }
        return con;
    }
}
