package service;

import dao.IOfficeDAO;
import dao.MyBatisImpl.OfficeDAO;
import model.Office;

import java.util.List;

public class OfficeService {

    private IOfficeDAO officeDAO = new OfficeDAO();

    public List<Office> getAllOffices() {
        return officeDAO.getOffice();
    }

    public Office getOffice(Long id) {
        return officeDAO.getOfficeById(id);
    }
}
