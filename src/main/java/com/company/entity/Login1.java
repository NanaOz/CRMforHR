package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login1 {
    @EmbeddedId
    private Login1Id id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Login1Id getId() {
        return id;
    }

    public void setId(Login1Id id) {
        this.id = id;
    }
}