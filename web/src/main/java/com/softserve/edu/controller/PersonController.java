package com.softserve.edu.controller;

import com.softserve.edu.dto.PersonDTO;
import com.softserve.edu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "save-person", method = RequestMethod.POST)
    public void getNewUser(@RequestBody PersonDTO personDTO) {
        System.out.println(personDTO);
    }
}
