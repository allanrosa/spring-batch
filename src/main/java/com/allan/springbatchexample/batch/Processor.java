package com.allan.springbatchexample.batch;

import com.allan.springbatchexample.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Employee, Employee> {

    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("001","Technology");
        DEPT_NAMES.put("002","Operations");
        DEPT_NAMES.put("003","Backoffice");
    }

    @Override
    public Employee process(Employee employee) throws Exception {
/*
* This method is responsible for the Bussiness logic
* */
        String oldDept = employee.getDept();
        employee.setDept(DEPT_NAMES.get(oldDept));
        return employee;
    }
}
