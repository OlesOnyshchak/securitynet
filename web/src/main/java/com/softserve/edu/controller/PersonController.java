package com.softserve.edu.controller;

import com.softserve.edu.dto.PersonDTO;
import com.softserve.edu.service.PersonService;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "{save-person}", method = RequestMethod.POST )
    public PersonDTO getNewUser(@RequestBody PersonDTO personDTO) {
        personService.save(
                            new Person(
                                    personDTO.getFirstName(),
                                    personDTO.getLastName(),
                                    personDTO.getDateOfBirth()
                                    )
                             );
        return personDTO;
    }
}
