package service;

import dao.ICarInspectionDAO;
import dao.MyBatisImpl.CarInspectionDAO;
import model.CarInspection;

import java.util.List;

public class CarInspectionService {

    private ICarInspectionDAO carInspectionDAO = new CarInspectionDAO();

    public List<CarInspection> getAllCarInspections() {
        return carInspectionDAO.getCarInspection();
    }

    public CarInspection getCarInspection(Long id) {
        return carInspectionDAO.getCarInspectionById(id);
    }
}
