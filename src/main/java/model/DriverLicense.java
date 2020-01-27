package model;

import java.sql.Date;

public class DriverLicense {

    private long id;
    private long number;
    private Date dateOfIssue;

    public DriverLicense() {
    }

    public DriverLicense(int number, Date dateOfIssue) {
        this.number = number;
        this.dateOfIssue = dateOfIssue;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
