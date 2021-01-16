
package Repository;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface IRepository<T> {
    public abstract ArrayList<T> getAll() throws SQLException;
    public void add(T doctor) throws SQLException;
    public void delete(String tc) throws SQLException;
}
