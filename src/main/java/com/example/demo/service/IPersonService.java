package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface IPersonService {
    Map<String, Person> getAllPerson();

    ResponseEntity<Object> addNewPerson(Person person);


    ResponseEntity<Object> updatePerson(Person person);

    ResponseEntity<Object> deletePerson(String id);
}
