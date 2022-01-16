package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeIT")
public class EmployeeIT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "Project", nullable = false)
    private String project;

    @ManyToOne
    @JoinColumn(name = "EmployeeId")
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