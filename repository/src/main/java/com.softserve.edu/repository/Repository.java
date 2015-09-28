package repository;

import entity.Person;

import java.util.List;

public interface Repository {

    void save(Person person);

    void update(Person person);

    Person findById(int id);

    List<Person> getAll();

    void delete(int id);

}
