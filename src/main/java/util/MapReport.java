package util;

import model.Booking;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapReport {

    private Map<Long, Booking> reportMap = new HashMap<>();

    public void addBooking(Booking booking) {
        reportMap.put(booking.getId(), booking);
    }

    public void removeBooking(Booking booking) {
        reportMap.remove(booking.getId());
    }

    public Booking getByNumber(int number) {
        return reportMap.get(number);
    }

    public Collection<Booking> getAllBookings() {
        return reportMap.values();
    }

    public Set<Long> getAllNumbers() {
        return reportMap.keySet();
    }
}
