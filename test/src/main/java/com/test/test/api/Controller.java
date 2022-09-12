package com.test.test.api;

import com.test.test.domain.EmployeeDomain;
import com.test.test.model.Employee;
import com.test.test.service.EmployeeService;
import com.test.test.service.impl.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;
//mark class as Controller
@CrossOrigin
@RestController
public class Controller {

    @Autowired
    EmployeeService service;
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @GetMapping("/getAll")
    public List<EmployeeDomain> getAll() {
        return service.getAll();
    }
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/create")
    public void create(@RequestBody Employee data) {
        service.createEmployee(data);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMethod(@PathVariable("id") long id) {
    service.delete(id);
    }

    @PutMapping("/update/{id}")
    public void updateMethod(@PathVariable("id")  long id, @RequestBody Employee data ){
    service.updateEmployee(id,data);
    }
    @GetMapping  ("/user/{id}")
    public Optional<EmployeeDomain> userID(@PathVariable("id")  long  id ){
      return service.getEmpId(id);
    }
}
