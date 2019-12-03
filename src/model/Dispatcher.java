package model;

public final class Dispatcher extends Person {

    private Office office;

    public Dispatcher(String name, String phoneNumber, Office office) {
        super(name, phoneNumber);
        this.office = office;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getOffice().toString();
    }
}
