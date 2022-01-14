package com.company.utils;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.Objects;
import javax.validation.constraints.Email;


@Entity
@Table (name = "Users")
public class User {

    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "surname", nullable = false)
    private String surname;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "name", nullable = false)
    private String name;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "fathersName", nullable = false)
    private String fathersName;

    @Column (name = "login")
    private String login;

    @Column (name = "password")
    private String password;

    @Column (name = "email")
    private String email;                 //почта

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "post", nullable = false)
    private String post;

    @Transient
    private String skills; //навыки
    @Transient
    private String status; // статус "работает", "уволен", "не работает", "приглашен на собеседование"
    @Transient
    private int numberPhone; //телефон (если будем делать как ссылку для звонка)
    @Transient
    private String сity;//город
    @Transient
    private String education; //образование
    @Transient
    private String workExperience; //стаж, предыдущее место работы

    public User() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
