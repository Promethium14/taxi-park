package mapper;

import model.DriverLicense;

import java.util.List;

public interface DriverLicenseMapper {

    DriverLicense getDriverLicenseById(Long id);

    List<DriverLicense> getDriverLicense();

    void insertDriverLicense(DriverLicense entity);

    void deleteDriverLicense(DriverLicense entity);

    void updateDriverLicense(DriverLicense entity);
}
