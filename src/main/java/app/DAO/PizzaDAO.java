package app.DAO;

import app.entity.PizzaDb;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
public class PizzaDAO implements DAO<PizzaDb> {
    private static  final Logger logger = LoggerFactory.getLogger(PizzaDAO.class);
    private SessionFactory sessionFactory;
    @Override
    public void add(PizzaDb data) {

    }

    @Override
    public PizzaDb getByID(int id) {
        return null;
    }

    @Override
    public void read() throws SQLException {

    }

    @Override
    public void clear() throws SQLException {

    }

    @Override
    public List<PizzaDb> getAllData() {
        return null;
    }

    @Override
    public List<Integer> getAllId() {
        return null;
    }
}
