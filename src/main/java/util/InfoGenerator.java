package util;

import model.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class InfoGenerator {

    private static final int SEED = 100;
    private static Random random = new Random();

    public static Booking generateBooking() {
        return new Booking(generateRandomDate(),
                (Dispatcher) generatePersonInformation(new Dispatcher()),
                (Driver) generatePersonInformation(new Driver()),
                (Client) generatePersonInformation(new Client()),
                generateCar(), generateAddress());
    }

    public static Person generatePersonInformation(Person person) {
        if(person instanceof Driver) {
            Driver driver = (Driver) person;
            driver.setName("driver" + Math.abs(random.nextInt(SEED)));
            driver.setPhonenumber(Long.toString(Math.abs(random.nextInt(SEED))));
            driver.setLicence(generateDriverLicence());
            return driver;
        } else if (person instanceof Dispatcher) {
            Dispatcher dispatcher = (Dispatcher) person;
            dispatcher.setName("dispatcher" + Math.abs(random.nextInt(SEED)));
            dispatcher.setPhonenumber(Long.toString(Math.abs(random.nextInt(SEED))));
            dispatcher.setOffice(generateOffice());
            return dispatcher;
        } else if (person instanceof Client) {
            Client client = (Client) person;
            client.setName("client" + Math.abs(random.nextInt(SEED)));
            client.setPhonenumber(Long.toString(Math.abs(random.nextInt(SEED))));
            return client;
        }
        return null;
    }

    public static Office generateOffice() {
        return new Office("name" + Math.abs(random.nextInt(SEED)),
                generateAddress());
    }

    public static DriverLicense generateDriverLicence() {
        return new DriverLicense(Math.abs(random.nextInt(SEED)), generateRandomDate());
    }

    public static Date generateRandomDate() {
        StringBuilder dateString = new StringBuilder();
        int day = random.nextInt(30);
        int month = new Random().nextInt(11);
        int year = new Random().nextInt(1018);
        dateString.append(year+1000);
        dateString.append("-");
        dateString.append(month+1);
        dateString.append("-");
        dateString.append(day+1);
        System.out.println(dateString.toString());
        return Date.valueOf(dateString.toString());
    }

    public static Address generateAddress() {
        return new Address("city" + Math.abs(random.nextInt(SEED)),
                "street" + Math.abs(random.nextInt(SEED)),
                Math.abs(random.nextInt(SEED)));
    }

    public static Car generateCar() {
        return new Car(Integer.toString(Math.abs(random.nextInt())),
                "brand" + Math.abs(random.nextInt(SEED)),
                "model" + Math.abs(random.nextInt(SEED)),
                "color" + Math.abs(random.nextInt(SEED)));
    }

    public static long generateId() {
        return random.nextInt(23331231);
    }
}
