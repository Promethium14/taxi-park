package model;

public final class Driver extends Person {

    private static int driverCounter = 0;
    private DriverLicense licence;

    public Driver() {
        super();
    }

    public Driver(String name, String phoneNumber, DriverLicense licence) {
        super(name, phoneNumber);
        this.licence = licence;
        driverCounter++;
    }

    public static int getDriverCounter() {
        return driverCounter;
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
