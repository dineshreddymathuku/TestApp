package com.test.test.service;

import com.test.test.domain.EmployeeDomain;
import com.test.test.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    void createEmployee(Employee data);

    List<EmployeeDomain> getAll();

    void delete(long id);

    void updateEmployee(long id, Employee data);

    Optional<EmployeeDomain> getEmpId(long id);


}
