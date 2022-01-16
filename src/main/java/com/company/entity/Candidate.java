package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "Candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "Status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "Post_id")
    private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
}