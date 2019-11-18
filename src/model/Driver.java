package model;

public class Driver extends Person {

    private Document licence;

    public Driver() {
        super();
    }

    public Driver(String name, long phoneNumber, Document licence) {
        super(name, phoneNumber);
        this.licence = licence;
    }

    public Document getLicence() {
        return licence;
    }

    public void setLicence(Document drivingLicence) {
        this.licence = drivingLicence;
    }

    @Override
    public String toString() {
        return  super.toString() + " licence: " + getLicence().toString();
    }
}
