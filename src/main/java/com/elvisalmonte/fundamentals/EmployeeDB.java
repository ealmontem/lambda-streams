package com.elvisalmonte.fundamentals;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DataBaseService<Employee>{
    @Override
    public Employee getById(Long id) {
        Employee employee = new Employee();
        employee.setDni(UUID.randomUUID().toString());
        employee.setName("Jhon");
        employee.setSalary(233.44);
        return employee;
    }

    @Override
    public List<Employee> getAllProducts() {
        return List.of();
    }
}
