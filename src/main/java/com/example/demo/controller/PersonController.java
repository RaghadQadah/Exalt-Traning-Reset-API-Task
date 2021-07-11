package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PersonController {
    @Autowired
    PersonService service;

    @RequestMapping(value = "/Get/api/Person")
    public Map<String,Person> getAllUser() {
       return service.getAllPerson();
    }
    @RequestMapping(method = RequestMethod.POST,value="/Post/api/Person")
    public ResponseEntity<Object> addUser(@RequestBody Person person) {
        return service.addNewPerson(person);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Put/api/Person")
    public ResponseEntity<Object> updatePerson(@RequestBody Person person) {
        return service.updatePerson(person);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/DELETE/api/Person/{id}")
    public ResponseEntity<Object> deletePerson(@PathVariable String id  ) {
        return service.deletePerson(id);
    }


}
