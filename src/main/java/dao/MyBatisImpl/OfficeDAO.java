package dao.MyBatisImpl;

import dao.IOfficeDAO;
import model.Office;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class OfficeDAO implements IOfficeDAO {
    
    private IOfficeDAO entityDAO;
    private Class<IOfficeDAO> DAOClass = IOfficeDAO.class;
    
    @Override
    public Office getOfficeById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        Office entity =  entityDAO.getOfficeById(id);
        session.close();
        return entity;
    }

    @Override
    public List<Office> getOffice() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Office> entities =  entityDAO.getOffice();
        session.close();
        return entities;
    }

    @Override
    public void insertOffice(Office entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertOffice(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteOffice(Office entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteOffice(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateOffice(Office entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateOffice(entity);
        session.commit();
        session.close();
    }
}
