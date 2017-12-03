package com.thanglequoc.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public List<Employee> getAllEmployees(){
	return employeeRepository.findAll();
    }
    
    public void saveEmployee(Employee employee){
	employeeRepository.save(employee);
    }
}
