package com.vgs.grpc.demo;

import com.vgs.grpc.demo.model.PersonModel;

import java.util.List;

public interface PersonService {

  List<? extends PersonModel> newPerson(PersonModel person);
}
