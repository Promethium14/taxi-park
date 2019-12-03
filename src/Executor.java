import model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Executor {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");

        Date dateOfIssue = dateFormat.parse("22-10-2018");

        Date dateOfInspection = dateFormat.parse("15-11-2019");
        Car car = new Car("91837", "honda", "civic", "grey");
        Office office = new Office("office1", new Address("city1", "street1", 20));
        Person driver = new Driver("driver1","90766722", new DriverLicense(9088865, dateOfIssue));
        Person client = new Client("Vlad", "6737894980");
        Dispatcher dispatcher = new Dispatcher("dispatcher1", "9876522431", office);
        CarInspection inspection = new CarInspection(dateOfInspection, car, "All right");
        System.out.println(inspection);
        Booking booking = new Booking();
        booking.setCar(car);
        booking.setDispatcher(dispatcher);
        booking.setClient(client);
        booking.setNumber(76342);
        booking.setDate(new Date());
        booking.setDriver(driver);
        booking.print();
        System.out.println("-----------------------------");
        booking.print(true);
    }
}
