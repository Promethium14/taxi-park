package model;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private String name;
    private Address address;

    private List<Dispatcher> dispatchers = new ArrayList<>();

    public Office() {
    }

    public Office(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "office name: " + getName() + " address: " + getAddress().toString();
    }

    public List<Dispatcher> getDispatchers() {
        return dispatchers;
    }

    public void addDispatcher(Dispatcher dispatcher){
        this.dispatchers.add(dispatcher);
    }

    public void removeDispatcher(Dispatcher dispatcher){
        this.dispatchers.remove(dispatcher);
    }
}
