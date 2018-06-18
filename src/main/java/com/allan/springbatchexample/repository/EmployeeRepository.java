package com.allan.springbatchexample.repository;

import com.allan.springbatchexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
