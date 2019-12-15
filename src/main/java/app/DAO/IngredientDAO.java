package app.DAO;

import app.entity.IngredientsDb;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.List;

public class IngredientDAO implements DAO<IngredientsDb> {
    private static final Logger Logger = LoggerFactory.getLogger(IngredientDAO.class);
    private SessionFactory sessionFactory;
    @Override
    public void add(IngredientsDb data) {

    }

    @Override
    public IngredientsDb getByID(int id) {
        return null;
    }

    @Override
    public void read() throws SQLException {

    }

    @Override
    public void clear() throws SQLException {

    }

    @Override
    public List<IngredientsDb> getAllData() {
        return null;
    }

    @Override
    public List<Integer> getAllId() {
        return null;
    }
}
