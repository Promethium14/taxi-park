package dao;

import model.CarInspection;

import java.util.List;

public interface ICarInspectionDAO {

    CarInspection getCarInspectionById(Long id);

    List<CarInspection> getCarInspection();

    void insertCarInspection(CarInspection entity);

    void deleteCarInspection(CarInspection entity);

    void updateCarInspection(CarInspection entity);
}
