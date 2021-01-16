/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class DbContext {

    public static final String user_name = "SYSTEM";
    public static final String password = "75321";
    public static final String db_name = "hospital";
    public static final String host = "localhost";
    public static final int port = 1521;
    public static String url = "jdbc:oracle:thin:@" + host + ":" + port + ":xe";

    public static Connection getConnection() throws SQLException {
        //return DriverManager.getConnection(url,user_name,password);
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "75321");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
}
