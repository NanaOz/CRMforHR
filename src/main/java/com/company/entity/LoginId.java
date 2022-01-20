//package com.company.entity;
//
//import org.hibernate.Hibernate;
//import org.hibernate.annotations.Type;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.Lob;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Embeddable
//public class LoginId implements Serializable {
////    private static final long serialVersionUID = 3639739096961335166L;
//    @Lob
//    @Type(type = "org.hibernate.type.TextType")
//    @Column(name = "login", nullable = false)
//    private String login;
//    @Lob
//    @Type(type = "org.hibernate.type.TextType")
//    @Column(name = "password", nullable = false)
//    private String password;
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(login, password);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//        LoginId entity = (LoginId) o;
//        return Objects.equals(this.login, entity.login) &&
//                Objects.equals(this.password, entity.password);
//    }
//}