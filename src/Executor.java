import model.Booking;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;

import util.InfoGenerator;
import util.Report;
import util.ReportException;

public class Executor {

    public static void main(String[] args) throws ParseException {

        Report report = new Report();
        for (int i = 0; i < 10; i++) {
            report.addBooking(InfoGenerator.generateBooking());
        }
        Date date = report.getLastBooking().getDate();
        try {
            report.find(date).print();
        } catch (ReportException reportException) {
            reportException.printStackTrace();
        }
        int number = new Random().nextInt(); //aaaaaaaaaaaaaaaaaaaaaaaa
        try {
            report.find(number).print();
        } catch (ReportException reportException) {
            reportException.printStackTrace();
        }
    }
}
