package dao.MyBatisImpl;

import dao.ICarDAO;
import model.Car;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class CarDAO implements ICarDAO {

    private ICarDAO entityDAO;
    private Class<ICarDAO> DAOClass = ICarDAO.class;
    
    @Override
    public Car getCarById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        Car entity =  entityDAO.getCarById(id);
        session.close();
        return entity;
    }

    @Override
    public List<Car> getCar() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Car> entities =  entityDAO.getCar();
        session.close();
        return entities;
    }

    @Override
    public void insertCar(Car entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertCar(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteCar(Car entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteCar(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateCar(Car entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateCar(entity);
        session.commit();
        session.close();
    }
}
