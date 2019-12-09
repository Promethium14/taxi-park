import model.Booking;
import util.InfoGenerator;
import util.MapReport;
import util.Report;
import util.ReportException;

import java.util.Date;
import java.util.Random;

public class Executor {

    public static void main(String[] args) {

        Report report = new Report();
        MapReport mapReport = new MapReport();

        for (int i = 0; i < 10; i++) {
            Booking booking = InfoGenerator.generateBooking();
            report.addBooking(booking);
            mapReport.addBooking(booking);
        }
        Date date = report.getLastBooking().getDate();
        try {
            report.find(date).print();
        } catch (ReportException reportException) {
            reportException.printStackTrace();
        }
        int number = new Random().nextInt();
        try {
            report.find(number).print();
        } catch (ReportException reportException) {
            reportException.printStackTrace();
        }

        for (Booking b : mapReport.getAllBookings()) {
            b.print();
        }
    }
}
