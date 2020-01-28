import com.google.gson.Gson;
import model.Address;
import model.Car;
import model.Driver;
import service.AddressService;
import service.CarService;
import service.UserService;
import util.FileUtil;
import util.LoggerUtil;

import java.util.List;

public class Executor {

    private static final String PROPERTIES_FILE_NAME = "taxi-park.properties";

    public static void main(String[] args) {

        List<Driver> drivers = new UserService().getDrivers();
        List<Address> addresses = new AddressService().getAllAddresses();
        List<Car> cars = new CarService().getAllCars();

        for (Driver driver: drivers) {
            LoggerUtil.LOGGER.info("Driver: " + driver.getName() + " -- " + driver.getLicense().getDateOfIssue());
        }

        Gson json = new Gson();
        String driversStr = json.toJson(drivers);
        String addressesStr = json.toJson(addresses);
        String carsStr = json.toJson(cars);

        FileUtil.toFile("data/drivers.json", driversStr);
        FileUtil.toFile("data/addresses.json", addressesStr);
        FileUtil.toFile("data/cars.json", carsStr);
    }
}
