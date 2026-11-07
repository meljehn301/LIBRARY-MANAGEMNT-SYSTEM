/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*/

package Project;
import java.sql.*;

/**
 *
 * @author user
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("con.msql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysq://localhost:3306/lms","root","123456)");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    }

