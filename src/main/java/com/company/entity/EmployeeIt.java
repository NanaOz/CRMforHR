//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "EmployeeIt")
//public class EmployeeIt {
//    private long id;
//    private String project;
//    private Employee employeeByEmployeeId;
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "Id", nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "Project", nullable = false, length = -1)
//    public String getProject() {
//        return project;
//    }
//
//    public void setProject(String project) {
//        this.project = project;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmployeeIt that = (EmployeeIt) o;
//        return id == that.id && Objects.equals(project, that.project);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, project);
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "EmployeeId", referencedColumnName = "ID", nullable = false)
//    public Employee getEmployeeByEmployeeId() {
//        return employeeByEmployeeId;
//    }
//
//    public void setEmployeeByEmployeeId(Employee employeeByEmployeeId) {
//        this.employeeByEmployeeId = employeeByEmployeeId;
//    }
//}
