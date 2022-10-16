package com.wsousa.keycloak.service;

import com.wsousa.keycloak.entity.Employee;
import com.wsousa.keycloak.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface EmployeeService {

    public Employee getEmployee(int employeeId);
    public List<Employee> getAllEmployees();
}
