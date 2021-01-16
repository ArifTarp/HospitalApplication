
package Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class JDBCAppManagerRepository extends JDBCConnection{
    Connection connection;
    DbContext dbContext;
    Statement statement;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public JDBCAppManagerRepository() throws SQLException {
        try {
            dbContext = new DbContext();
            connection = dbContext.getConnection();
            System.out.println("Connection is success.");
        } catch (SQLException exception) {
            dbContext.showErrorMessage(exception);
        }
    }

    public Boolean validationUser(String userName, String password) throws SQLException {
        String query = "SELECT * FROM appmanagers WHERE userName = '" + userName+"' and password = '"+password+"'";
        /*preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, userName);
        preparedStatement.setString(2, password);s
        System.out.println(preparedStatement);
        ResultSet rs = preparedStatement.executeQuery();*/
        Statement stmt=connection.createStatement();  
        ResultSet rs=stmt.executeQuery(query);
        boolean check = true;
        
        if(!rs.isBeforeFirst()){
            check = false;
        }
        return true;
    }  

    @Override
    public String connectionStatus() throws SQLException {
        if(connection.isClosed() == false)
            return "Not Connected\n";
        else
            return "Connected\n";
    }
}
