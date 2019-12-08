import model.Booking;

import java.text.ParseException;

import util.InfoGenerator;

public class Executor {

    public static void main(String[] args) throws ParseException {
        Booking booking = InfoGenerator.generateBooking();
        booking.print();
        System.out.println("-----------------------------");
        booking.print(true);
    }
}
