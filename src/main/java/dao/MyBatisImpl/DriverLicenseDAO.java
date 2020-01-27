package dao.MyBatisImpl;

import dao.IDriverLicenseDAO;
import model.DriverLicense;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class DriverLicenseDAO implements IDriverLicenseDAO {
    
    private IDriverLicenseDAO entityDAO;
    private Class<IDriverLicenseDAO> DAOClass = IDriverLicenseDAO.class;
    
    @Override
    public DriverLicense getDriverLicenseById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        DriverLicense entity =  entityDAO.getDriverLicenseById(id);
        session.close();
        return entity;
    }

    @Override
    public List<DriverLicense> getDriverLicense() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<DriverLicense> entities =  entityDAO.getDriverLicense();
        session.close();
        return entities;
    }

    @Override
    public void insertDriverLicense(DriverLicense entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertDriverLicense(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteDriverLicense(DriverLicense entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteDriverLicense(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateDriverLicense(DriverLicense entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateDriverLicense(entity);
        session.commit();
        session.close();
    }
}
