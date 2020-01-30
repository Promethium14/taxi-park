import model.Booking;
import service.BookingService;
import util.InfoGenerator;

public class Executor {

    private static final String PROPERTIES_FILE_NAME = "taxi-park.properties";

    public static void main(String[] args) {

        Booking booking = InfoGenerator.generateBooking();
        BookingService bookingService = new BookingService();
        bookingService.saveBooking(booking);

//        List<Driver> drivers = new UserService().getDrivers();
//
//        for (Driver driver: drivers) {
//            LoggerUtil.LOGGER.info("Driver: " + driver.getName() + " -- " + driver.getLicense().getDateOfIssue());
//        }
//
//        JacksonJsonImpl<Driver> driverJacksonJson = new JacksonJsonImpl<>();
//
//        driverJacksonJson.toJsonFile("data/drivers.json", drivers);
//
//        List<Driver> fromJson = driverJacksonJson.fromJsonFile("data/drivers.json");
//
//        System.out.println(fromJson);



//        Gson json = new Gson();
//        String driversStr = json.toJson(drivers);
//        String addressesStr = json.toJson(addresses);
//        String carsStr = json.toJson(cars);
//
//        FileUtil.toNewFile("data/drivers.json", driversStr);
//        FileUtil.toNewFile("data/addresses.json", addressesStr);
//        FileUtil.toNewFile("data/cars.json", carsStr);
    }
}
