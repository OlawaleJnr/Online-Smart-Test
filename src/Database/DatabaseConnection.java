package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OLAWALE_JNR
 */
public class DatabaseConnection {
    public static Connection connection = null;
    public static String MySQL_DataBase_Driver = "com.mysql.jdbc.Driver";
    public static String Database_URL = "jdbc:mysql://localhost:3306/online_smart_test";
    public static String Database_User = "root";
    public static String Database_Pass = "";
    public static Connection getConnection(){
        try {
            Class.forName(MySQL_DataBase_Driver);
            connection = DriverManager.getConnection(Database_URL, Database_User, Database_Pass);
            JOptionPane.showMessageDialog(null, "Database Connection Successfully Established");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database Connection Not Established");
        }
        return connection; 
    }
}
