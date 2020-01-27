package dao;

import model.Client;

import java.util.List;

public interface IClientDAO {

    Client getClientById(Long id);

    List<Client> getClient();

    void insertClient(Client entity);

    void deleteClient(Client entity);

    void updateClient(Client entity);
}
