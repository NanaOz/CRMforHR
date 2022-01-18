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

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "login")
    private String login;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "password")
    private String password;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "role")
    private String role;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
}

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }


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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
