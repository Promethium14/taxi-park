package dao.MyBatisImpl;

import dao.IDriverDAO;
import dao.IPersonDAO;
import model.Driver;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class DriverDAO implements IDriverDAO {
    
    private IDriverDAO entityDAO;
    private Class<IDriverDAO> DAOClass = IDriverDAO.class;
    private IPersonDAO personDAO;
    private Class<IPersonDAO> personDAOClass = IPersonDAO.class;
    
    @Override
    public Driver getDriverById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        Driver entity =  entityDAO.getDriverById(id);
        session.close();
        return entity;
    }

    @Override
    public List<Driver> getDriver() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Driver> entities =  entityDAO.getDriver();
        session.close();
        return entities;
    }

    @Override
    public void insertDriver(Driver entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertDriver(entity);
        personDAO = session.getMapper(personDAOClass);
        personDAO.insertPerson(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteDriver(Driver entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteDriver(entity);
        personDAO = session.getMapper(personDAOClass);
        personDAO.deletePerson(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateDriver(Driver entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateDriver(entity);
        personDAO = session.getMapper(personDAOClass);
        personDAO.updatePerson(entity);
        session.commit();
        session.close();
    }
}
