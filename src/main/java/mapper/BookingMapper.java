package mapper;

import model.Booking;

import java.util.List;

public interface BookingMapper {

    Booking getBookingById(Long id);

    List<Booking> getBooking();

    void insertBooking(Booking entity);

    void deleteBooking(Booking entity);

    void updateBooking(Booking entity);
}
