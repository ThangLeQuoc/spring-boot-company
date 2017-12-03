package com.thanglequoc.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping(value="", method = RequestMethod.GET)
    public List<Department> getAllDepartment(){
	return departmentService.getAllDepartment();
    }
    
    @RequestMapping(value="", method = RequestMethod.POST)
    public void saveDepartment(@RequestBody Department department){
	departmentService.saveDepartment(department);
    }
}
