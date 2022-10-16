package com.wsousa.keycloak;

import com.wsousa.keycloak.entity.Employee;
import com.wsousa.keycloak.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@SpringBootApplication
public class SpringBootKeycloakApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKeycloakApplication.class, args);
    }

}
