package model;

public final class Driver extends Person {

    private static int driverCounter = 0;

    private Long id;
    private DriverLicense license;

    public Driver() {
        super();
    }

    public Driver(String name, String phoneNumber, DriverLicense licence) {
        super(name, phoneNumber);
        this.license = licence;
        driverCounter++;
    }

    public static int getDriverCounter() {
        return driverCounter;
    }

    public DriverLicense getLicense() {
        return license;
    }

    public void setLicence(DriverLicense drivingLicense) {
        this.license = drivingLicense;
    }

    @Override
    public String toString() {
        return  super.toString() + " license: " + getLicense().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
