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
import javax.validation.constraints.NotNull;

import com.thanglequoc.department.Department;

@Entity
@Table(name="employees")
public class Employee implements Serializable {
    
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    private Long id;
    
    @Column(name="name", nullable = false)
    private String name;
    
    
    @Column(name="salary")
    private Double salary;
    
    /**
     * One employee -> One department || One department -> many employee
     * */
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="department", referencedColumnName="department_id", nullable = false)
    private Department department;
    
    
}
