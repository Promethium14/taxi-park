package model;

import java.util.Objects;

public final class Dispatcher extends Person {

    private long id;
    private long personId;
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
                ((Dispatcher) obj).getPhonenumber().equals(this.getPhonenumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getOffice(), this.getPhonenumber());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
