package pcodeclan.com.github.employeetracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pcodeclan.com.github.employeetracker.models.Employee;
import pcodeclan.com.github.employeetracker.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

}
