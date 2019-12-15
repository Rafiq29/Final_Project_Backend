package app.DAO;

import app.entity.OrderDb;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
public class OrderDAO implements DAO<OrderDb>  {
    private static final Logger Logger =LoggerFactory.getLogger(OrderDAO.class);
    private SessionFactory sessionFactory;
    @Override
    public void add(OrderDb data) {

    }

    @Override
    public OrderDb getByID(int id) {
        return null;
    }

    @Override
    public void read() throws SQLException {

    }

    @Override
    public void clear() throws SQLException {

    }

    @Override
    public List<OrderDb> getAllData() {
        return null;
    }

    @Override
    public List<Integer> getAllId() {
        return null;
    }
}
