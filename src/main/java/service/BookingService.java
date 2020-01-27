package service;

import dao.IBookingDAO;
import dao.MyBatisImpl.BookingDAO;
import model.Booking;

import java.util.List;

public class BookingService {

    private IBookingDAO bookingDAO = new BookingDAO();

    public List<Booking> getAllBookings() {
        return bookingDAO.getBooking();
    }

    public Booking getBooking(Long id) {
        return bookingDAO.getBookingById(id);
    }

}
