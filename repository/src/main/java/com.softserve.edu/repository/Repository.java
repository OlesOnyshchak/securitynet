package repository;

import entity.Person;

import java.util.List;

public interface Repository<T> {
    void save(T entity);

    void update(T entity);

    Person findById(int id);

    List<T> getAll();

}
