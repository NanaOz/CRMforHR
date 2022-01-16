package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "Candidate")
public class Candidate1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "Status_id")
    private com.company.entity.Status1 status;

    @ManyToOne
    @JoinColumn(name = "Post_id")
    private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public com.company.entity.Status1 getStatus() {
        return status;
    }

    public void setStatus(com.company.entity.Status1 status) {
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
}