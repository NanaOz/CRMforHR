package com.company.entity;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "Status", nullable = false)
    private String status;
//
//    @Setter
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "post")
//
//    private Collection<Employee> employeeC;


    public Status () {}
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
//        Status status1 = (Status) o;
//        return id == status1.id && Objects.equals(status, status1.status);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, status);
//    }
}