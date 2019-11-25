package model;

import java.util.Date;

public class DriverLicense {

    private int number;
    private Date dateOfIssue;

    public DriverLicense() {
    }

    public DriverLicense(int number, Date dateOfIssue) {
        this.number = number;
        this.dateOfIssue = dateOfIssue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String toString() {
        return "document number: " + getNumber() +
                " date of issue: " + getDateOfIssue().toString();
    }
}
