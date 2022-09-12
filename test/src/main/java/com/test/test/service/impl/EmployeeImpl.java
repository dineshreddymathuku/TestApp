package com.test.test.service.impl;

import com.test.test.domain.EmployeeDomain;
import com.test.test.model.Employee;
import com.test.test.repo.EmployeeRepo;
import com.test.test.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public void createEmployee(Employee data) {
        EmployeeDomain empDomain = new EmployeeDomain();
        BeanUtils.copyProperties(data,empDomain);
        employeeRepo.save(empDomain);
    }

    @Override
    public List<EmployeeDomain> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public void delete(long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public void updateEmployee(long id, Employee data) {
        EmployeeDomain domain = new EmployeeDomain();
        BeanUtils.copyProperties(data, domain);
        domain.setId(id);
        employeeRepo.save(domain);
    }

    @Override
    public Optional<EmployeeDomain> getEmpId(long id) {
        return employeeRepo.findById(id);
    }
}
