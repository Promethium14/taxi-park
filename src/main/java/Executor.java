import model.Address;
import model.Booking;
import model.Office;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.*;

import java.util.Date;
import java.util.Random;

public class Executor {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String PROPERTIES_FILE_NAME = "taxi-park.properties";

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
            LOGGER.info("Booking #" + report.find(date).getNumber() + " is found!");
        } catch (ReportException reportException) {
            LOGGER.error(reportException.getStackTrace());
        }

        int number = new Random().nextInt();
        try {
            LOGGER.info("Booking #" + report.find(number).toString() + " is found!");
        } catch (ReportException reportException) {
            LOGGER.error(reportException.getMessage());
        }

        for (Booking b : mapReport.getAllBookings()) {
            LOGGER.info("Booking #" + b.getNumber() + " found in the Report");
        }

        Office office = new Office();
        Address officeAddress = new Address();

        officeAddress
                .setCity(PropertiesParser
                        .getPropertyByName("office.address.city", PROPERTIES_FILE_NAME));
        officeAddress
                .setBuilding(Integer
                        .parseInt(PropertiesParser
                                .getPropertyByName("office.address.building", PROPERTIES_FILE_NAME)));
        officeAddress
                .setStreet(PropertiesParser
                        .getPropertyByName("office.address.street", PROPERTIES_FILE_NAME));
        office.setAddress(officeAddress);
        office.setName(PropertiesParser
                .getPropertyByName("office.name", PROPERTIES_FILE_NAME));
        LOGGER.info("Office was successfully loaded from file");

    }
}
