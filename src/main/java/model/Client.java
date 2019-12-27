package model;

public final class Client extends Person {

    private static int clientCounter = 0;

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
}
