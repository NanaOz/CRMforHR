//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "login")
//@IdClass(LoginPK.class)
//public class Login {
//    private String login;
//    private String userpassword;
//    private User usersByUserId;
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "login", nullable = false, length = -1)
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "userpassword", nullable = false, length = -1)
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
//        Login login1 = (Login) o;
//        return Objects.equals(login, login1.login) && Objects.equals(userpassword, login1.userpassword);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(login, userpassword);
//    }
//
//    @OneToOne
//    @JoinColumn(name = "User_Id", referencedColumnName = "id", nullable = false)
//    public User getUsersByUserId() {
//        return usersByUserId;
//    }
//
//    public void setUsersByUserId(User usersByUserId) {
//        this.usersByUserId = usersByUserId;
//    }
//}
