import dao.*;
import dao.MyBatisImpl.*;
import model.*;
import service.BookingService;
import util.InfoGenerator;
import util.JSONUtil;
import util.LoggerUtil;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Executor {

    private static final String PROPERTIES_FILE_NAME = "taxi-park.properties";

    public static void main(String[] args) {

        clearDB();

        JSONUtil<Booking> bookingJSONUtil = new JSONUtil<>();
        BookingService bookingService = new BookingService();

        List<Booking> bookingsFromJson = bookingJSONUtil.fromJSONFile("data/bookings.json");

//        List<Booking> bookings = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Booking booking = InfoGenerator.generateBooking();
//            bookingService.saveBooking(booking);
//            bookings.add(booking);
//        }

        for (Booking booking : bookingsFromJson) {
            bookingService.saveBooking(booking);
        }

        List<Booking> dbBookings = bookingService.getAllBookings();

        for (Booking booking: dbBookings) {
            LoggerUtil.LOGGER.info("Booking: " + booking.getId());
        }

        bookingJSONUtil.toJsonFile("data/bookings" +
                new Timestamp(System.currentTimeMillis()) + ".json", dbBookings);
    }

    private static void clearDB() {

        IBookingDAO bookingDAO = new BookingDAO();
        ICarDAO carDAO = new CarDAO();
        IClientDAO clientDAO = new ClientDAO();
        IDispatcherDAO dispatcherDAO = new DispatcherDAO();
        IDriverDAO driverDAO = new DriverDAO();
        IDriverLicenseDAO licenseDAO = new DriverLicenseDAO();
        IOfficeDAO officeDAO = new OfficeDAO();
        IAddressDAO addressDAO = new AddressDAO();

        List<Booking> bookings = bookingDAO.getBooking();
        List<Car> cars = carDAO.getCar();
        List<Client> clients = clientDAO.getClient();
        List<Dispatcher> dispatchers = dispatcherDAO.getDispatcher();
        List<Driver> drivers = driverDAO.getDriver();
        List<DriverLicense> licenses = licenseDAO.getDriverLicense();
        List<Office> offices = officeDAO.getOffice();
        List<Address> addresses = addressDAO.getAddress();

        for (Booking entity: bookings) {
            bookingDAO.deleteBooking(entity);
        }
        for (Car entity: cars) {
            carDAO.deleteCar(entity);
        }
        for (Client entity: clients) {
            clientDAO.deleteClient(entity);
        }
        for (Dispatcher entity: dispatchers) {
            dispatcherDAO.deleteDispatcher(entity);
        }
        for (Driver entity: drivers) {
            driverDAO.deleteDriver(entity);
        }
        for (DriverLicense entity: licenses) {
            licenseDAO.deleteDriverLicense(entity);
        }
        for (Office entity: offices) {
            officeDAO.deleteOffice(entity);
        }
        for (Address entity: addresses) {
            addressDAO.deleteAddress(entity);
        }
    }
}
