import model.Booking;
import model.Office;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Random;

public class Executor {

    private static final Logger LOGGER = LogManager.getLogger();

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
            LOGGER.info(report.find(date).toString());
        } catch (ReportException reportException) {
            LOGGER.error(reportException.getStackTrace());
        }

        int number = new Random().nextInt();
        try {
            LOGGER.info(report.find(number).toString());
        } catch (ReportException reportException) {
            LOGGER.error(reportException.getMessage());
        }

        for (Booking b : mapReport.getAllBookings()) {
            LOGGER.info(b.toString());
        }

        try {
            Office office = PropertiesParser.getOfficeFromFile(
                    new Executor().getFileFromResources("taxi-park.properties"));
            LOGGER.info("***************************************************");
            LOGGER.info(office.toString());
        } catch (IOException ioException) {
            LOGGER.error(ioException.getMessage());
        }
    }

    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found");
        } else {
            return new File(resource.getFile());
        }

    }
}
