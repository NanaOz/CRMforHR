package com.company.entity;


import lombok.Getter;
import lombok.Setter;
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

//    @Getter
//    @Setter
//    @OneToOne(optional = false, mappedBy = "user")
//    private Employee owner;

//    @Getter
//    @Setter
//    @OneToOne(optional = false, mappedBy = "user1")
//    private Candidate owner1;

    public User () {}



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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", email='" + email + '\'' +
//                ", post='" + owner.getPost() + '\'' +
                '}';
    }


}
