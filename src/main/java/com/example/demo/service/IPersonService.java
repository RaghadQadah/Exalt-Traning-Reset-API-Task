package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;



public interface IPersonService {
    public Map<String, Person> getAllPerson();

    public ResponseEntity<Object> addNewPerson(Person person);


    public ResponseEntity<Object> updatePerson( Person person);

    public ResponseEntity<Object> deletePerson( String id);
}
