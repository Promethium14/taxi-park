package model;


public abstract class Person {

    private Long id;
    private String name;
    private String phonenumber;

    protected Person() {
    }

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phonenumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phoneNumber) {
        this.phonenumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                " phone number: " + getPhonenumber();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
