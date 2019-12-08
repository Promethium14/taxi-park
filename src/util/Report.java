package util;

import model.Booking;
import model.DriverLicense;

import java.util.*;

public class Report {

    private Queue<Booking> reportQueue = new LinkedList<>();
    private Set<DriverLicense> driverLicenses = new HashSet<>();

    public Queue getReportQueue() {
        return reportQueue;
    }

    public Booking getLastBooking() {
        return reportQueue.peek();
    }

    public void addBooking(Booking booking){
        reportQueue.offer(booking);
    }

    public void removeLastBooking(){
        reportQueue.poll();
    }

    public Booking find(int number) throws ReportException {
        for(Booking entity : reportQueue) {
            if(entity.getNumber() == number) {
                return entity;
            } else {
                throw new ReportException();
            }
        }
        return null;
    }

    public Booking find(Date date) throws ReportException {
        for(Booking entity : reportQueue) {
            if(entity.getDate().equals(date)) {
                return entity;
            } else {
                throw new ReportException();
            }
        }
        return null;
    }

    public Set<DriverLicense> getDriverLicenses() {
        return driverLicenses;
    }

    public boolean addDriverLicence(DriverLicense license){
        return driverLicenses.add(license);
    }

    public boolean removeDriverLicence(DriverLicense license) {
        return driverLicenses.remove(license);
    }

}
