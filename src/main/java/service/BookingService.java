package service;

import dao.*;
import dao.MyBatisImpl.*;
import model.Booking;
import util.InfoGenerator;

import java.util.List;

public class BookingService {

    private IBookingDAO bookingDAO = new BookingDAO();
    private IDriverLicenseDAO licenseDAO = new DriverLicenseDAO();
    private IAddressDAO addressDAO = new AddressDAO();
    private IDispatcherDAO dispatcherDAO = new DispatcherDAO();
    private IDriverDAO driverDAO = new DriverDAO();
    private ICarDAO carDAO = new CarDAO();
    private IOfficeDAO officeDAO = new OfficeDAO();
    private IClientDAO clientDAO = new ClientDAO();

    public List<Booking> getAllBookings() {
        return bookingDAO.getBooking();
    }

    public Booking getBooking(Long id) {
        return bookingDAO.getBookingById(id);
    }

    public void saveBooking(Booking booking) {
//        booking.getAddress().setId(InfoGenerator.generateId());
//        booking.getDispatcher().getOffice().getAddress().setId(InfoGenerator.generateId());
//        booking.getDriver().getLicense().setId(InfoGenerator.generateId());
//        booking.getDriver().setId(InfoGenerator.generateId());
//        booking.getDriver().setPersonId(InfoGenerator.generateId());
//        booking.getClient().setPersonId(InfoGenerator.generateId());
//        booking.getClient().setId(InfoGenerator.generateId());
//        booking.getDispatcher().setPersonId(InfoGenerator.generateId());
//        booking.getDispatcher().setId(InfoGenerator.generateId());
//        booking.getDispatcher().getOffice().setId(InfoGenerator.generateId());
//        booking.getCar().setId(InfoGenerator.generateId());
//        booking.setId(InfoGenerator.generateId());

        addressDAO.insertAddress(booking.getAddress());
        addressDAO.insertAddress(booking.getDispatcher().getOffice().getAddress());
        licenseDAO.insertDriverLicense(booking.getDriver().getLicense());
        driverDAO.insertDriver(booking.getDriver());
        clientDAO.insertClient(booking.getClient());
        officeDAO.insertOffice(booking.getDispatcher().getOffice());
        dispatcherDAO.insertDispatcher(booking.getDispatcher());
        carDAO.insertCar(booking.getCar());
        bookingDAO.insertBooking(booking);
    }

}
