package com.company.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    private Long id;

    @OneToOne(optional = false, cascade = CascadeType.REFRESH, fetch=FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "status_id")
    private Status status;

    @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "post_id")
    private Post post;

//
//    @OneToMany(mappedBy = "candidate", cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
//    private List<CandidateTag> candidateTag;

    public Candidate () {}

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

    public boolean isSelectedStatus(Status status){
        return this.status.getId().equals(status.getId());
    }
    public boolean isSelectedPost(Post post){
        return this.post.getId().equals(post.getId());
    }
    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", user=" + user +
                ", status=" + status +
                ", post=" + post +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return id == candidate.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
//
//    public List<CandidateTag> getCandidateTag() {
//        return candidateTag;
//    }
//
//    public void setCandidateTag(List<CandidateTag> candidateTag) {
//        this.candidateTag = candidateTag;
//    }

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(name = "candidate_tag",
            joinColumns = @JoinColumn(name = "candidate_id"),
            inverseJoinColumns ={ @JoinColumn(name = "tag_id"), @JoinColumn(name = "level")}
    )
    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}