package com.thanglequoc.department;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.thanglequoc.employee.Employee;

@Entity
public class Department {
    
    
    @Id
    @Column(name="department_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @Column(name="name", nullable = false)
    private String name;
    
    
    @OneToMany(mappedBy="department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employee> employee;


    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @return the employee
     */
    public List<Employee> getEmployee() {
        return employee;
    }


    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
