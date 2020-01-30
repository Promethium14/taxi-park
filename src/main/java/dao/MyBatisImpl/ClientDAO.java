package dao.MyBatisImpl;

import dao.IClientDAO;
import dao.IPersonDAO;
import model.Client;
import model.Person;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class ClientDAO implements IClientDAO {
    
    private IClientDAO entityDAO;
    private Class<IClientDAO> DAOClass = IClientDAO.class;
    private IPersonDAO personDAO;
    private Class<IPersonDAO> personDAOClass = IPersonDAO.class;
    
    @Override
    public Client getClientById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        Client entity =  entityDAO.getClientById(id);
        session.close();
        return entity;
    }

    @Override
    public List<Client> getClient() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Client> entities =  entityDAO.getClient();
        session.close();
        return entities;
    }

    @Override
    public void insertClient(Client entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        personDAO = session.getMapper(personDAOClass);
        personDAO.insertPerson(entity);
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertClient(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteClient(Client entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        personDAO = session.getMapper(personDAOClass);
        entityDAO.deleteClient(entity);
        personDAO.deletePerson(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateClient(Client entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        personDAO = session.getMapper(personDAOClass);
        entityDAO.updateClient(entity);
        personDAO.updatePerson(entity);
        session.commit();
        session.close();
    }
}
