package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "employeeIT")
public class EmployeeIT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "project", nullable = false)
    private String project;

    @ManyToOne
    @JoinColumn(name = "employeeid")
    private Employee employeeId;

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }


    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}