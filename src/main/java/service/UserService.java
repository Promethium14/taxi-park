package service;

import dao.IClientDAO;
import dao.IDispatcherDAO;
import dao.IDriverDAO;
import dao.MyBatisImpl.ClientDAO;
import dao.MyBatisImpl.DispatcherDAO;
import dao.MyBatisImpl.DriverDAO;
import model.Client;
import model.Dispatcher;
import model.Driver;

import java.util.List;

public class UserService {

    private IClientDAO clientDAO = new ClientDAO();
    private IDriverDAO driverDAO = new DriverDAO();
    private IDispatcherDAO dispatcherDAO = new DispatcherDAO();

    public List<Client> getClients() {
        return clientDAO.getClient();
    }

    public List<Dispatcher> getDispatchers() {
        return dispatcherDAO.getDispatcher();
    }

    public List<Driver> getDrivers() {
        return driverDAO.getDriver();
    }

    public Client getClient(Long id) {
        return clientDAO.getClientById(id);
    }

    public Driver getDriver(Long id) {
        return driverDAO.getDriverById(id);
    }

    public Dispatcher getDispatcher(Long id){
        return dispatcherDAO.getDispatcherById(id);
    }
}
