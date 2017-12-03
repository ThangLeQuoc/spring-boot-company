package com.thanglequoc.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository departmentRepository;
    
    public List<Department> getAllDepartment(){
	return departmentRepository.findAll();
    }
    
    public void saveDepartment(Department department){
	departmentRepository.save(department);
    }
}

