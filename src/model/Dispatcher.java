package model;

import java.util.Objects;

public final class Dispatcher extends Person {

    private Office office;

    public Dispatcher(){
    }

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

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dispatcher)) return false;
        if(obj == this) return true;
        return ((Dispatcher) obj) .getName().equals(this.getName()) &&
                ((Dispatcher) obj).getPhoneNumber().equals(this.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getOffice(), this.getPhoneNumber());
    }
}
