package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeHR")
public class EmployeeHR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmployeeHr that = (EmployeeHr) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Employee_Id", referencedColumnName = "ID", nullable = false)
//    public Employee1 getEmployeeByEmployeeId() {
//        return employeeByEmployeeId;
//    }
//
//    public void setEmployeeByEmployeeId(Employee1 employeeByEmployeeId) {
//        this.employeeByEmployeeId = employeeByEmployeeId;
//    }
}