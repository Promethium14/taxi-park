package dao;

import model.Person;

import java.util.List;

public interface IPersonDAO {

    Person getPersonById(Long id);

    List<Person> getPerson();

    void insertPerson(Person entity);

    void deletePerson(Person entity);

    void updatePerson(Person entity);
    
}
