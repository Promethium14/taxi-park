package model;

public final class Client extends Person {

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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
