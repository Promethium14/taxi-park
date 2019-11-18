package model;

import java.util.Date;

public class CarInspection {
    private Date inspectionDate;
    private Car car;
    private String comment;

    public CarInspection() {
    }

    public CarInspection(Date inspectionDate, Car car, String inspectionComment) {
        this.inspectionDate = inspectionDate;
        this.car = car;
        this.comment = inspectionComment;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String inspectionComment) {
        this.comment = inspectionComment;
    }

    @Override
    public String toString() {
        return "inspection date: " + getInspectionDate() +
                " car: \n" + getCar().toString() +
                " comment: " + getComment();
    }
}
