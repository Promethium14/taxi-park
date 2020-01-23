package mapper;

import model.CarInspection;

import java.util.List;

public interface CarInspectionMapping {

    CarInspection getCarInspectionById(Long id);

    List<CarInspection> getCarInspection();

    void insertCarInspection(CarInspection entity);

    void deleteCarInspection(CarInspection entity);

    void updateCarInspection(CarInspection entity);
}
