/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class DbContext {
    
    public static final String user_name = "Hospital";   
    public static final String password = "gWpKKeWvKpbKq8db";   
    public static final String db_name = "hospital";  
    public static final String host =  "localhost";  
    public static final int port = 3306;
    public static String url = "jdbc:mysql://localhost/" + db_name +"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public static Connection getConnection() throws SQLException{                      
        return DriverManager.getConnection(url,user_name,password);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : "+ exception.getErrorCode());
    }
}
