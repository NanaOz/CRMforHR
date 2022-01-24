package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "employee_it")
public class EmployeeIT {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;


    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private Employee employee;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Employee getEmployee() {return employee;}
    public void setEmployee(Employee employee) {this.employee = employee;}

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }


//    @OneToMany(mappedBy = "employeeIT", cascade = CascadeType.ALL, orphanRemoval = true)
//
//    private Collection<EmployeeITTag> employeeITTags = new ArrayList<>();
//
//    public Collection<EmployeeITTag> getEmployeeITTags() {
//        return employeeITTags;
//    }
//
//    public void setEmployeeITTags(Collection<EmployeeITTag> employeeITTags) {
//        this.employeeITTags = employeeITTags;
//    }
//
}