package repository;

import entity.Person;

import java.util.List;

public interface Repository {
    void save(Person entity);

    void update(Person entity);

    Person findById(int id);

    List<Person> getAll();

}
