package model;

import java.util.Date;

public class Booking implements IPrintable{

    private int number;
    private Date date;
    private Dispatcher dispatcher;
    private Person driver;
    private Person client;
    private Car car;

    public Booking(int number, Date date, Dispatcher dispatcher, Driver driver, Client client, Car car) {
        this.number = number;
        this.date = date;
        this.dispatcher = dispatcher;
        this.driver = driver;
        this.client = client;
        this.car = car;
    }

    public Booking() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
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
