//package com.company.entity;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.io.Serializable;
//import java.util.Objects;
//
//public class LoginPK implements Serializable {
//    private String login;
//    private String userpassword;
//
//    @Column(name = "login", nullable = false, length = -1)
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    @Column(name = "userpassword", nullable = false, length = -1)
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public String getUserpassword() {
//        return userpassword;
//    }
//
//    public void setUserpassword(String userpassword) {
//        this.userpassword = userpassword;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        LoginPK loginPK = (LoginPK) o;
//        return Objects.equals(login, loginPK.login) && Objects.equals(userpassword, loginPK.userpassword);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(login, userpassword);
//    }
//}
