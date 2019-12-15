package app.DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T> {
    public void add (T data);
    public T getByID(int id);
    public void read() throws SQLException;
    public void clear() throws SQLException;
    public  List<T> getAllData();
    public  List<Integer> getAllId();


}
