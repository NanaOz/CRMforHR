package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {
//    @EmbeddedId
//    private LoginId id;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
    private Role role;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id1;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "login", nullable = false)
    private String login;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "user_password", nullable = false)
    private String userpassword;

    public String getPassword() {
        return userpassword;
    }

    public void setPassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId1() {
        return id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public LoginId getId() {
//        return id;
//    }
//
//    public void setId(LoginId id) {
//        this.id = id;
//    }
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
}