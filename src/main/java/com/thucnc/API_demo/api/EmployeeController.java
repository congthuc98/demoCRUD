package com.thucnc.API_demo.api;

import com.thucnc.API_demo.model.Employees;
import com.thucnc.API_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/emget/", method = RequestMethod.GET)
    public ResponseEntity<List<Employees>> listAllContact(){
        List<Employees> lstEm= employeeService.findAll();
        if(lstEm.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        //return ResponseEntity<List<Contact>>(listContact, HttpStatus.OK);
        return new ResponseEntity<List<Employees>>(lstEm, HttpStatus.OK);
    }
}
