package com.vgs.grpc.demo.persistence;


import com.vgs.grpc.demo.model.PersonModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Person implements PersonModel {

  @Id
  @GeneratedValue
  Integer id;

  @Column
  String firstName;

  @Column
  String lastName;

  @Column
  Integer age;
}
