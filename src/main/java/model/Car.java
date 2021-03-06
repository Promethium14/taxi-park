package model;

import java.io.Serializable;

public class Car implements Serializable {

    private long id;
    private String number;
    private String model;
    private String color;
    private String brand;

    public Car() {
    }

    public Car(String number, String brand, String model, String color) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "brand: " + getBrand() +
                " model: " + getModel() +
                " color: " + getColor() +
                " number: " + getNumber();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
