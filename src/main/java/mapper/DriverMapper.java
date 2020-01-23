package mapper;

import model.Driver;

import java.util.List;

public interface DriverMapper {

    Driver getDriverById(Long id);

    List<Driver> getDriver();

    void insertDriver(Driver entity);

    void deleteDriver(Driver entity);

    void updateDriver(Driver entity);
}
