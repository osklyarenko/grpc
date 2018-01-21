package com.vgs.grpc.demo;

import com.vgs.grpc.demo.model.PersonModel;
import com.vgs.grpc.demo.persistence.Person;
import com.vgs.grpc.demo.persistence.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

  @Autowired
  PersonRepository personRepository;

  @Override
  public List<? extends PersonModel> newPerson(PersonModel person) {

    Person newPerson = Person.builder()
        .firstName(person.getFirstName())
        .lastName(person.getLastName())
        .age(person.getAge())
        .build();

    personRepository.save(newPerson);

    return personRepository.findAll();
  }
}
