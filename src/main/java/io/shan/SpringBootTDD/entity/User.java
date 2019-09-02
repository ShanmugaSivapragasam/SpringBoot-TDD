package io.shan.SpringBootTDD.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Slf4j
@lombok.Getter
@lombok.Setter
public class User {


    @Id
    @GeneratedValue
    @lombok.Setter(AccessLevel.NONE)
    Long userId;


    String name;

    String city;



}
