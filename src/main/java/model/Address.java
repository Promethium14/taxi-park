package model;

public class Address {

    private Integer id;
    private String city;
    private String street;
    private int building;

    public Address() {
    }

    public Address(String city, String street, int building) {

        this.building = building;
        this.city = city;
        this.street = street;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "city: " + getCity() +
                " street: " + getStreet() +
                " building: " + getBuilding();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
