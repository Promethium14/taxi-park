package dao.MyBatisImpl;

import dao.IAddressDAO;
import model.Address;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class AddressDAO implements IAddressDAO{

    private IAddressDAO entityDAO;
    private Class<IAddressDAO> DAOClass = IAddressDAO.class;

    @Override
    public Address getAddressById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        Address entity =  entityDAO.getAddressById(id);
        session.close();
        return entity;
    }

    @Override
    public List<Address> getAddress() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Address> entities =  entityDAO.getAddress();
        session.close();
        return entities;
    }

    @Override
    public void insertAddress(Address entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertAddress(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteAddress(Address entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteAddress(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateAddress(Address entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateAddress(entity);
        session.commit();
        session.close();
    }
}
