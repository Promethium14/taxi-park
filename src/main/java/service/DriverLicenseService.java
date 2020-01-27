package service;

import dao.IDriverLicenseDAO;
import dao.MyBatisImpl.DriverLicenseDAO;
import model.DriverLicense;

import java.util.List;

public class DriverLicenseService {

    private IDriverLicenseDAO driverLicenseDAO = new DriverLicenseDAO();

    public List<DriverLicense> getAllDriverLicense() {
        return driverLicenseDAO.getDriverLicense();
    }

    public DriverLicense getDriverLicense(Long id) {
        return driverLicenseDAO.getDriverLicenseById(id);
    }
}
