package com.allan.springbatchexample.batch;


import com.allan.springbatchexample.model.Employee;
import com.allan.springbatchexample.repository.EmployeeRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> employees) throws Exception {

        System.out.println("Data saved for Employees: "+ employees);
        employeeRepository.save(employees);
    }
}
