package com.softserve.edu.service.impl;

import com.softserve.edu.service.PersonService;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Repository;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    Repository repository;

    @Override
    public void save(Person person) {
        repository.save(person);
    }

    @Override
    public void update(Person person) {
        repository.update(person);
    }

    @Override
    public Person findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Person> getAll() {
        return repository.getAll();
    }

    @Override
    public void delete(int id) {

    }
}
