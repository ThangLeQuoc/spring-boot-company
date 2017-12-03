package com.thanglequoc.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.thanglequoc.department.Department;

@Entity
@Table(name="employees")
public class Employee implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    private Long id;
    
    @Column(name="name", nullable = false)
    private String name;
    
    @Column(name="salary", nullable = true)
    private Double salary;
    
    
    /**
     * One employee -> One department || One department -> many employee
     * */
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="department", referencedColumnName="department_id", nullable = true)
    private Department department;


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
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }


    /**
     * @return the department
     */
    public Department getDepartment() {
        return department;
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
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }


    /**
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
}
