package com.thanglequoc.employee;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String getAllEmployee(){
	return "This should get all employees";
    }
    
    @RequestMapping(value="", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){
	String message = "";
	if(Objects.nonNull(employee)){
	    employeeService.saveEmployee(employee);
	    message = "Employee created successfully";
	}
	else {
	    message = "Error";
	}
	return message;
    }
}
