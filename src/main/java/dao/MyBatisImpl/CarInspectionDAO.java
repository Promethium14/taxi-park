package dao.MyBatisImpl;

import dao.ICarInspectionDAO;
import model.CarInspection;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class CarInspectionDAO implements ICarInspectionDAO {
    
    private ICarInspectionDAO entityDAO;
    private Class<ICarInspectionDAO> DAOClass = ICarInspectionDAO.class;
    
    @Override
    public CarInspection getCarInspectionById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        CarInspection entity =  entityDAO.getCarInspectionById(id);
        session.close();
        return entity;
    }

    @Override
    public List<CarInspection> getCarInspection() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<CarInspection> entities =  entityDAO.getCarInspection();
        session.close();
        return entities;
    }

    @Override
    public void insertCarInspection(CarInspection entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertCarInspection(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteCarInspection(CarInspection entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteCarInspection(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateCarInspection(CarInspection entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateCarInspection(entity);
        session.commit();
        session.close();
    }
}
