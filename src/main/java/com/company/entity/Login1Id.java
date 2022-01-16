package com.company.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Login1Id implements Serializable {
    private static final long serialVersionUID = 3639739096961335166L;
    @Lob
    @Column(name = "login", nullable = false)
    private String login;
    @Lob
    @Column(name = "userpassword", nullable = false)
    private String userpassword;

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, userpassword);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Login1Id entity = (Login1Id) o;
        return Objects.equals(this.login, entity.login) &&
                Objects.equals(this.userpassword, entity.userpassword);
    }
}