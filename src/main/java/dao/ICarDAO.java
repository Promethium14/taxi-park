package dao;

import model.Car;

import java.util.List;

public interface ICarDAO {

    Car getCarById(Long id);

    List<Car> getCar();

    void insertCar(Car entity);

    void deleteCar(Car entity);

    void updateCar(Car entity);
}
