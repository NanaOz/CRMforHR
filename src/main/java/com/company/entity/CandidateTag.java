//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "CandidateTag")
//public class CandidateTag {
//    private long id;
//    private Long level;
//    private Candidate candidateByCandidateId;
//    private Tags tagsByTagId;
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id", nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "Level", nullable = true)
//    public Long getLevel() {
//        return level;
//    }
//
//    public void setLevel(Long level) {
//        this.level = level;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        CandidateTag that = (CandidateTag) o;
//        return id == that.id && Objects.equals(level, that.level);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, level);
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Candidate_id", referencedColumnName = "ID", nullable = false)
//    public Candidate getCandidateByCandidateId() {
//        return candidateByCandidateId;
//    }
//
//    public void setCandidateByCandidateId(Candidate candidateByCandidateId) {
//        this.candidateByCandidateId = candidateByCandidateId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Tag_id", referencedColumnName = "Id", nullable = false)
//    public Tags getTagsByTagId() {
//        return tagsByTagId;
//    }
//
//    public void setTagsByTagId(Tags tagsByTagId) {
//        this.tagsByTagId = tagsByTagId;
//    }
//}
