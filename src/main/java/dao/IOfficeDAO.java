package dao;

import model.Office;

import java.util.List;

public interface IOfficeDAO {

    Office getOfficeById(Long id);

    List<Office> getOffice();

    void insertOffice(Office entity);

    void deleteOffice(Office entity);

    void updateOffice(Office entity);
}
