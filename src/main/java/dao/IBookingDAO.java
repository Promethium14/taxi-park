package dao;

import model.Booking;

import java.util.List;

public interface IBookingDAO {

    Booking getBookingById(Long id);

    List<Booking> getBooking();

    void insertBooking(Booking entity);

    void deleteBooking(Booking entity);

    void updateBooking(Booking entity);
}
