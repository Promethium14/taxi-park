package dao.MyBatisImpl;

import dao.IBookingDAO;
import model.Booking;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisConfigUtil;

import java.util.List;

public class BookingDAO implements IBookingDAO {

    private IBookingDAO entityDAO;
    private Class<IBookingDAO> DAOClass = IBookingDAO.class;
    
    @Override
    public Booking getBookingById(Long id) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        Booking entity =  entityDAO.getBookingById(id);
        session.close();
        return entity;
    }

    @Override
    public List<Booking> getBooking() {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Booking> entities =  entityDAO.getBooking();
        session.close();
        return entities;
    }

    @Override
    public void insertBooking(Booking entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertBooking(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteBooking(Booking entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteBooking(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateBooking(Booking entity) {
        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateBooking(entity);
        session.commit();
        session.close();
    }
}
