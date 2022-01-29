package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "employee_it")
public class EmployeeIT {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;


    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "id")
    private Employee employee;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(name = "employee_it_tag",
            joinColumns = @JoinColumn(name = "employee_it_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

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