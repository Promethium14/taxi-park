package mapper;

import model.Person;

import java.util.List;

public interface PersonMapper {

    Person getPersonById(Long id);

    List<Person> getPerson();

    void insertPerson(Person person);

    void deletePerson(Person person);

    void updatePerson(Person person);

}
