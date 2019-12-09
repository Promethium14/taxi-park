package model;

import java.util.Date;
import java.util.Objects;

public class Booking implements IPrintable {

    private static int counter = 0;

    private int number;
    private Date date;
    private Dispatcher dispatcher;
    private Driver driver;
    private Client client;
    private Car car;

    public Booking(Date date, Dispatcher dispatcher, Driver driver, Client client, Car car) {
        this.date = date;
        this.dispatcher = dispatcher;
        this.driver = driver;
        this.client = client;
        this.car = car;
        this.number = ++counter;
    }

    public Booking() {
    }

    public int getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking #" + getNumber() + ":\n" +
                "date: " + getDate().toString() +
                "\ndetails: \nclient: " + getClient().toString() + "\n" +
                "driver: " + getDriver().toString() + "\n" +
                "car: " + getCar().toString() + "\n" +
                "dispatcher: " + getDispatcher().toString();
    }

    public void print(boolean isFullOrder) {
        if (isFullOrder) {
            System.out.println(this.toString());
        }
    }

    @Override
    public void print(){
        System.out.println("Order #" + getNumber() + ":\n" +
                "date: " + getDate().toString() +
                "\ndetails: \nclient: " + getClient().toString() + "\n" +
                "driver: " + getDriver().toString() + "\n" +
                "car: " + getCar().toString());
    }
}
