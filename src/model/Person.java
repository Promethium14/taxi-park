package model;

public abstract class Person {
    private String name;
    private long phoneNumber;

    protected Person() {
    }

    protected Person(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                " phone number: " + getPhoneNumber();
    }
}
