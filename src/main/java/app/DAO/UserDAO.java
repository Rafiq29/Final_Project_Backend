package app.DAO;

import app.entity.User;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAO implements DAO<User> {
    private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);
    private SessionFactory sessionFactory;

    @Override
    public void add(User data) {

    }

    @Override
    public User getByID(int id) {
        return null;
    }

    @Override
    public void read() throws SQLException {

    }

    @Override
    public void clear() throws SQLException {

    }

    @Override
    public List<User> getAllData() {
        return null;
    }

    @Override
    public List<Integer> getAllId() {
        return null;
    }
}
