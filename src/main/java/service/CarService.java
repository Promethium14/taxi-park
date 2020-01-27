package service;

import dao.ICarDAO;
import dao.IClientDAO;
import dao.MyBatisImpl.CarDAO;
import model.Car;

import java.util.List;

public class CarService {

    private ICarDAO carDAO = new CarDAO();

    public List<Car> getAllCars() {
        return carDAO.getCar();
    }

    public Car getCar(Long id) {
        return carDAO.getCarById(id);
    }
}
