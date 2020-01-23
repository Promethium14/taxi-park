package mapper;

import model.Address;

import java.util.List;

public interface AddressMapper {

    Address getAddressById(Integer id);

    List<Address> getAddress();

    void insertAddress(Address entity);

    void deleteAddress(Address entity);

    void updateAddress(Address entity);
}
