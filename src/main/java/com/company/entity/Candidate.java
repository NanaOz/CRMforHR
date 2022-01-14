//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "Candidate")
//public class Candidate {
//    private long id;
//    private Users usersByUserId;
//    private Status statusByStatusId;
//    private Post postByPostId;
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "ID", nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Candidate candidate = (Candidate) o;
//        return id == candidate.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "User_Id", referencedColumnName = "id", nullable = false)
//    public Users getUsersByUserId() {
//        return usersByUserId;
//    }
//
//    public void setUsersByUserId(Users usersByUserId) {
//        this.usersByUserId = usersByUserId;
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
//}
