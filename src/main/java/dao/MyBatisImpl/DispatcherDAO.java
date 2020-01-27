package dao.MyBatisImpl;

import dao.IDispatcherDAO;
import dao.IPersonDAO;
import model.Dispatcher;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class DispatcherDAO implements IDispatcherDAO {
    
    private IDispatcherDAO entityDAO;
    private Class<IDispatcherDAO> DAOClass = IDispatcherDAO.class;
    private IPersonDAO personDAO;
    private Class<IPersonDAO> personDAOClass = IPersonDAO.class;

    @Override
    public Dispatcher getDispatcherById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        Dispatcher entity =  entityDAO.getDispatcherById(id);
        session.close();
        return entity;
    }

    @Override
    public List<Dispatcher> getDispatcher() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Dispatcher> entities =  entityDAO.getDispatcher();
        session.close();
        return entities;
    }

    @Override
    public void insertDispatcher(Dispatcher entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertDispatcher(entity);
        personDAO = session.getMapper(personDAOClass);
        personDAO.insertPerson(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteDispatcher(Dispatcher entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteDispatcher(entity);
        personDAO = session.getMapper(personDAOClass);
        personDAO.deletePerson(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateDispatcher(Dispatcher entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateDispatcher(entity);
        personDAO = session.getMapper(personDAOClass);
        personDAO.updatePerson(entity);
        session.commit();
        session.close();
    }
}
