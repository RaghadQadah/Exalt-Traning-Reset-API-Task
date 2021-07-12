package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Service
public class PersonService implements IPersonService{
    //private static final List<Person> personRepo = new ArrayList<>();
     private static Map<String,Person> personRepo = new HashMap<>();
    static {
        Person person1 = new Person();
        person1.setId("1");
        person1.setName("raghad123");
        person1.setJobs(Arrays.asList("Student"));
        personRepo.put(person1.getId(),person1);

        Person person2 = new Person();
        person2.setId("2");
        person2.setName("raghadQadah");
        person2.setAge(22);
        person2.setJobs(Arrays.asList("Student"));
        personRepo.put(person2.getId(),person2);
    }

    public Map<String,Person> getAllPerson() {
        return personRepo;
    }

    public ResponseEntity<Object> addNewPerson(Person person) {
        personRepo.put(person.getId(),person);
        return new ResponseEntity<>("added new person successsfully", HttpStatus.OK);
    }


    public ResponseEntity<Object> updatePerson( Person person) {
        personRepo.remove(person.getId());
        personRepo.put(person.getId(), person);
        return new ResponseEntity<>("updated successsfully", HttpStatus.OK);
    }

    public ResponseEntity<Object> deletePerson( String id) {
        personRepo.remove(id);
        return new ResponseEntity<>("deleted successsfully", HttpStatus.OK);
    }

}
