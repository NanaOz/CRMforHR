package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "Users")
public class User {
    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "surname")
    private String surname;
    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "username")
    private String username;
    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "fathers_name")
    private String fathersName;
    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "email")
    private String email;

//    public User () {}
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
//    @Column(username = "id", nullable = false)
    private long id;

    public long getId() {
        return id;
}

    public void setId(long id) {
        this.id = id;
    }
//    @Basic
//    @Column(username = "surname", nullable = false, length = -1)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    @Basic
//    @Column(username = "username", nullable = false, length = -1)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    @Basic
//    @Column(username = "fathersName", nullable = false, length = -1)
    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

//    @Basic
//    @Column(username = "email", nullable = false, length = -1)
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
        User user = (User) o;
        return id == user.id && Objects.equals(surname, user.surname) && Objects.equals(username, user.username) && Objects.equals(fathersName, user.fathersName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, username, fathersName, id, email);
    }
}
