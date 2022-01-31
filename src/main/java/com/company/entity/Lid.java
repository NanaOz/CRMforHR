package com.company.entity;

import javax.persistence.*;

public class Lid {
    private Long id;
    private User user;
    private Post post;
    private Status status;
    private Project project;
    private boolean isCandidate;

    //конструктор для Employee
    public Lid(Employee employee) {
       this.id= employee.getId();
       this.user=employee.getUser();
       this.post= employee.getPost();
       this.status=employee.getStatus();
       this.project= employee.getProject();
       this.isCandidate=false;
    }

    //конструктор для Candidate
    public Lid(Candidate candidate) {
        this.id= candidate.getId();
        this.user=candidate.getUser();
        this.post= candidate.getPost();
        this.status=candidate.getStatus();
        this.project= null;
        this.isCandidate=true;
    }



    @Override
    public String toString() {
        if(isCandidate) {
            return "Candidate{" +
                    "id=" + id +
                    "user=" + user +
                    ", post=" + post +
                    ", status=" + status +
                    '}';
        } else {
            return "Employee{" +
                    "id=" + id +
                    "user=" + user +
                    ", post=" + post +
                    ", status=" + status +
                    '}';
        }
    }


    public boolean isCandidate() {
        return isCandidate;
    }

    public void setCandidate(boolean candidate) {
        isCandidate = candidate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }



}
