package model;

public class Driver extends Person {

    private DriverLicense licence;

    public Driver() {
        super();
    }

    public Driver(String name, String phoneNumber, DriverLicense licence) {
        super(name, phoneNumber);
        this.licence = licence;
    }

    public DriverLicense getLicence() {
        return licence;
    }

    public void setLicence(DriverLicense drivingLicence) {
        this.licence = drivingLicence;
    }

    @Override
    public String toString() {
        return  super.toString() + " licence: " + getLicence().toString();
    }
}
