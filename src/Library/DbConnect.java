/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author emras
 */
public class DbConnect {
    public static Connection con;
    
    

    public static void Connect(){
        try {
            Class.forName("org.sqlite.JDBC");
            //con = DriverManager.getConnection("jdbc:sqlite::resource:library.sqlite");
            con = DriverManager.getConnection("jdbc:sqlite:library.sqlite");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
