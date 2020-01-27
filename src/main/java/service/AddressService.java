package service;

import dao.IAddressDAO;
import dao.MyBatisImpl.AddressDAO;
import model.Address;

import java.util.List;

public class AddressService {

    private IAddressDAO addressDAO = new AddressDAO();

    public List<Address> getAllAddresses() {
        return addressDAO.getAddress();
    }

    public Address getAddress(Long id) {
        return addressDAO.getAddressById(id);
    }
}
