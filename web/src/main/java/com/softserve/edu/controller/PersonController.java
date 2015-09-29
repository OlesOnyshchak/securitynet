package com.softserve.edu.controller;

import com.softserve.edu.service.PersonService;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "save-person", method = RequestMethod.POST)
    public ResponseEntity<HttpStatus> saveNewUser(@RequestBody Person person) {
        personService.save(person);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @RequestMapping(value = "get-person/{id}", method = RequestMethod.GET)
    public Person getUserById(@PathVariable("id") Integer id) {
        return personService.findById(id);
    }

    @RequestMapping(value = "get-all-person", method = RequestMethod.GET)
    public List<Person> getAllPerson() {
        return personService.getAll();
    }

    @RequestMapping(value = "delete-person/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<HttpStatus> deletePersonById(@PathVariable("id") Integer id) {
        personService.delete(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @RequestMapping(value = "update-person", method = RequestMethod.PUT)
    public ResponseEntity<HttpStatus> updatePerson(@RequestBody Person person) {
        personService.update(person);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
}
