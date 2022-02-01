package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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

    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable (name = "employee_it_tag",
            joinColumns = @JoinColumn(name = "employee_it_id"))
    @MapKeyJoinColumn(name = "tag_id")

    private Map<Tag, Level> tagLevel;

    public EmployeeIT () {}

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


    public Map<Tag, Level> getTagLevel() {
        return tagLevel;
    }

    public void setTagLevel(Map<Tag, Level> tagLevel) {
        this.tagLevel = tagLevel;
    }

    @Override
    public String toString() {
        return "EmployeeIT{" +
                "id=" + id +
                ", project=" + project +
                ", employee=" + employee +
                ", tagLevel=" + tagLevel +
                '}';
    }
}