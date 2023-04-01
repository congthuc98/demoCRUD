package com.thucnc.API_demo.service;

import com.thucnc.API_demo.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contact extends JpaRepository<Employees, Long> {
}
