
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
public class JDBCAppManagerRepository {
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
        String query = "SELECT * FROM appmanagers WHERE userName = ? and password = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, userName);
        preparedStatement.setString(2, password);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next() == false){
            return false;
        }
        else{
            return true;
        }
    }  
}
