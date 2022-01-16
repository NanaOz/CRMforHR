//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "Candidate")
//public class Candidate {
//    private long id;
//    private User usersByUserId;
//    private StatusRepository statusByStatusId;
//    private PostRepository postByPostId;
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
//    public User getUsersByUserId() {
//        return usersByUserId;
//    }
//
//    public void setUsersByUserId(User usersByUserId) {
//        this.usersByUserId = usersByUserId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Status_id", referencedColumnName = "Id")
//    public StatusRepository getStatusByStatusId() {
//        return statusByStatusId;
//    }
//
//    public void setStatusByStatusId(StatusRepository statusByStatusId) {
//        this.statusByStatusId = statusByStatusId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Post_id", referencedColumnName = "Id")
//    public PostRepository getPostByPostId() {
//        return postByPostId;
//    }
//
//    public void setPostByPostId(PostRepository postByPostId) {
//        this.postByPostId = postByPostId;
//    }
//}
