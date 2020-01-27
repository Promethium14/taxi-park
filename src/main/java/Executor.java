import model.Driver;
import service.UserService;
import util.LoggerUtil;

import java.util.List;

public class Executor {

    private static final String PROPERTIES_FILE_NAME = "taxi-park.properties";

    public static void main(String[] args) {

        List<Driver> drivers = new UserService().getDrivers();

        for (Driver driver: drivers) {
            LoggerUtil.LOGGER.info("Driver: " + driver.getName() + " -- " + driver.getLicense().getDateOfIssue());
        }
    }
}
