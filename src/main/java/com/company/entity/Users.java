package com.company.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "Users")
public class Users {
    private String surname;
    private String name;
    private String fathersName;
    private long id;
    private String email;

//    public Users () {}
    @Basic
    @Column(name = "surname", nullable = false, length = -1)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "fathersName", nullable = false, length = -1)
    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email", nullable = false, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && Objects.equals(surname, users.surname) && Objects.equals(name, users.name) && Objects.equals(fathersName, users.fathersName) && Objects.equals(email, users.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, fathersName, id, email);
    }
}
