
package Repository;

import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class JDBCPolyclinicRepository extends JDBCConnection{

    @Override
    public String connectionStatus() throws SQLException {
        if(connection.isClosed() == false)
            return "Not Connected\n";
        else
            return "Connected\n";
    }
    
}
