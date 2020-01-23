package mapper;

import model.Dispatcher;

import java.util.List;

public interface DispatcherMapper {
    
    Dispatcher getDispatcherById(Long id);

    List<Dispatcher> getDispatcher();

    void insertDispatcher(Dispatcher entity);

    void deleteDispatcher(Dispatcher entity);

    void updateDispatcher(Dispatcher entity);
}
