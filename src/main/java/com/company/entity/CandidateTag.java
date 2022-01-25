//package com.company.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "candidate_tag")
//public class CandidateTag {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "candidate_id", nullable = false)
//    private Candidate candidate;
//
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "tag_id", nullable = false)
//    private Tag tag;
//
//    @Column(name = "level")
//    private Long level;
//
//    public Long getLevel() {
//        return level;
//    }
//
//    public void setLevel(Long level) {
//        this.level = level;
//    }
//
//    public Tag getTag() {
//        return tag;
//    }
//
//    public void setTag(Tag tag) {
//        this.tag = tag;
//    }
//
//    public Candidate getCandidate() {
//        return candidate;
//    }
//
//    public void setCandidate(Candidate candidate) {
//        this.candidate = candidate;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
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
//    public TagRepository getTagsByTagId() {
//        return tagsByTagId;
//    }
//
//    public void setTagsByTagId(TagRepository tagsByTagId) {
//        this.tagsByTagId = tagsByTagId;
//    }
//}