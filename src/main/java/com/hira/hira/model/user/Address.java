package com.hira.hira.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // generates getter and setters for  a class
@NoArgsConstructor
@AllArgsConstructor
@Entity //tells the program that  the  app is an entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tell the system to generate th id automatically
    private Long id;

    private String  city;

    private String number;

    private  String streetname;

    private String  country;




}
