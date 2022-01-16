package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "Post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "Status_id")
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "User_Id", referencedColumnName = "id", nullable = false)
//    public User getUsersByUserId() {
//        return usersByUserId;
//    }
//
//    public void setUsersByUserId(User usersByUserId) {
//        this.usersByUserId = usersByUserId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Post_id", referencedColumnName = "Id")
//    public Post getPostByPostId() {
//        return postByPostId;
//    }
//
//    public void setPostByPostId(Post postByPostId) {
//        this.postByPostId = postByPostId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Status_id", referencedColumnName = "Id")
//    public Status getStatusByStatusId() {
//        return statusByStatusId;
//    }
//
//    public void setStatusByStatusId(Status statusByStatusId) {
//        this.statusByStatusId = statusByStatusId;
//    }
}