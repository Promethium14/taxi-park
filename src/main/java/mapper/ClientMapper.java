package mapper;

import model.Client;

import java.util.List;

public interface ClientMapper {

    Client getClientById(Long id);

    List<Client> getClient();

    void insertClient(Client entity);

    void deleteClient(Client entity);

    void updateClient(Client entity);
}
