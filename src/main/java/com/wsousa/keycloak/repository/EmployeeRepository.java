package com.wsousa.keycloak.repository;

import com.wsousa.keycloak.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
