package dao;

import model.Address;

import java.util.List;

public interface IAddressDAO {

    Address getAddressById(Long id);

    List<Address> getAddress();

    void insertAddress(Address entity);

    void deleteAddress(Address entity);

    void updateAddress(Address entity);
}
