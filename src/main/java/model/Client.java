package model;

import java.io.Serializable;

public final class Client extends Person implements Serializable {

    private static int clientCounter = 0;

    private long id;

    public Client() {
    }

    public Client(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public static int getClientCounter() {
        return clientCounter;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
