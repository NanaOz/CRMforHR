package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee_hr")
public class EmployeeHR {
    @Id
    private Long id;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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