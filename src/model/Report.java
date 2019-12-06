package model;

import java.util.*;

public class Report {

    private Queue<Booking> reportMap = new LinkedList<>();
    private Set<DriverLicense> driverLicenses = new HashSet<>();

    public Queue getReportMap() {
        return reportMap;
    }

    public Booking getLastBooking() {
        return reportMap.peek();
    }

    public void addBooking(Booking booking){
        reportMap.offer(booking);
    }

    public void removeLastBooking(){
        reportMap.poll();
    }

    public Set<DriverLicense> getDriverLicenses() {
        return driverLicenses;
    }

    public boolean addDriverLicece(DriverLicense license){
        return driverLicenses.add(license);
    }

    public boolean removeDriverLicence(DriverLicense license) {
        return driverLicenses.remove(license);
    }
}
