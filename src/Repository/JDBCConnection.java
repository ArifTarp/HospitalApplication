
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
public abstract class JDBCConnection {
    Connection connection;
    DbContext dbContext;
    Statement statement;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public abstract String connectionStatus() throws SQLException;
}
