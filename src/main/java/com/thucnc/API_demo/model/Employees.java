package com.thucnc.API_demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employees implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    String first_name;

    String last_name;

    String email;
}
