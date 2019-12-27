package util;

import model.Booking;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapReport {

    private Map<Integer, Booking> reportMap = new HashMap<>();

    public void addBooking(Booking booking) {
        reportMap.put(booking.getNumber(), booking);
    }

    public void removeBooking(Booking booking) {
        reportMap.remove(booking.getNumber());
    }

    public Booking getByNumber(int number) {
        return reportMap.get(number);
    }

    public Collection<Booking> getAllBookings() {
        return reportMap.values();
    }

    public Set<Integer> getAllNumbers() {
        return reportMap.keySet();
    }
}
