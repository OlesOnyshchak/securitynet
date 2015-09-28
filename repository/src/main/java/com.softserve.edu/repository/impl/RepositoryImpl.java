package repository.impl;

import entity.Person;
import repository.Repository;

import java.util.List;

public class RepositoryImpl<T> implements Repository<T> {

    @Override
    public void save(T entity) {

    }

    @Override
    public void update(T entity) {

    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }
}
