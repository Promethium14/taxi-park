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
        Driver driver = new Driver("driver1","90766722", new DriverLicense(9088865, dateOfIssue));
        Client client = new Client("Vlad", "6737894980");
        Dispatcher dispatcher = new Dispatcher("dispatcher1", "9876522431", office);
        CarInspection inspection = new CarInspection(dateOfInspection, car, "All right");
        System.out.println(inspection);
        Order order = new Order();
        order.setCar(car);
        order.setDispatcher(dispatcher);
        order.setClient(client);
        order.setNumber(76342);
        order.setDate(new Date());
        order.setDriver(driver);
        order.print();
    }
}
