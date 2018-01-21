package com.vgs.grpc.demo;

import com.vgs.grpc.demo.model.PersonModel;
import com.vgs.grpc.demo.persistence.Person;
import com.vgs.grpc.demo.persistence.PersonRepository;
import com.vgs.grpc.model.Messages;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

  @Autowired
  PersonService personService;

  @Before
  public void setUp() throws Exception {

  }

  @Test
  public void contextLoads() {
    Person person = Person.builder()
        .age(10)
        .firstName("John")
        .lastName("Smith")
        .build();

    List<? extends PersonModel> personList = personService.newPerson(person);

    Assert.assertTrue(personList.size() == 1);
  }

}
