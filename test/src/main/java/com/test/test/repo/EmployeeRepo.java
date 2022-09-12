package com.test.test.repo;

import com.test.test.domain.EmployeeDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDomain, Long> {

}
