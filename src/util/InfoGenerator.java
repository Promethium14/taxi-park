package util;

import model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class InfoGenerator {

    private static Random random = new Random();

    public static Booking generateBooking() {
        return new Booking(Math.abs(random.nextInt()),
                generateRandomDate(),
                (Dispatcher) generatePersonInformation(new Dispatcher()),
                (Driver) generatePersonInformation(new Driver()),
                (Client) generatePersonInformation(new Client()),
                generateCar());
    }

    public static Person generatePersonInformation(Person person) {
        if(person instanceof Driver) {
            Driver driver = (Driver) person;
            driver.setName("driver" + Math.abs(random.nextInt()));
            driver.setPhoneNumber(Long.toString(Math.abs(random.nextInt())));
            driver.setLicence(generateDriverLicence());
            return driver;
        } else if (person instanceof Dispatcher) {
            Dispatcher dispatcher = (Dispatcher) person;
            dispatcher.setName("dispatcher" + Math.abs(random.nextInt()));
            dispatcher.setPhoneNumber(Long.toString(Math.abs(random.nextInt())));
            dispatcher.setOffice(generateOffice());
            return dispatcher;
        } else if (person instanceof Client) {
            Client client = (Client) person;
            client.setName("client" + Math.abs(random.nextInt()));
            client.setPhoneNumber(Long.toString(Math.abs(random.nextInt())));
            return client;
        }
        return null;
    }

    public static Office generateOffice() {
        return new Office("name" + Math.abs(random.nextInt()),
                generateAddress());
    }

    public static DriverLicense generateDriverLicence() {
        return new DriverLicense(Math.abs(random.nextInt()), generateRandomDate());
    }

    public static Date generateRandomDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        StringBuilder dateString = new StringBuilder();
        int day = random.nextInt(31);
        int month = new Random().nextInt(12);
        int year = new Random().nextInt(2019);
        dateString.append(day);
        dateString.append("-");
        dateString.append(month);
        dateString.append("-");
        dateString.append(year);
        try {
            return dateFormat.parse(dateString.toString());
        } catch (ParseException parseException) {
            return null;
        }
    }

    public static Address generateAddress() {
        return new Address("city" + Math.abs(random.nextInt()),
                "street" + Math.abs(random.nextInt()),
                Math.abs(random.nextInt()));
    }

    public static Car generateCar() {
        return new Car(Integer.toString(Math.abs(random.nextInt())),
                "brand" + Math.abs(random.nextInt(10000)),
                "model" + Math.abs(random.nextInt(1111)),
                "color" + Math.abs(random.nextInt(255)));
    }
}
