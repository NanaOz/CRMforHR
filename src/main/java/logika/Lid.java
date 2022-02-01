package logika;

import com.company.entity.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lid {
    private Long id;
    private User user;
    private Post post;
    private Status status;
    private Project project;
    private boolean isCandidate;
    private Map<Tag,Level> candidateTags;
    private double summ;



    //конструктор для Employee
    public Lid(Employee employee) {
        this.id= employee.getId();
        this.user=employee.getUser();
        this.post= employee.getPost();
        this.status=employee.getStatus();
        this.project= employee.getProject();
        this.isCandidate=false;
//        this.employeeTags=employee.getTagLevelMap(); //todo настроить Employee
        this.summ=0;
    }


    //конструктор для Candidate
    public Lid(Candidate candidate) {
        this.id= candidate.getId();
        this.user=candidate.getUser();
        this.post= candidate.getPost();
        this.status=candidate.getStatus();
        this.project= null;
        this.isCandidate=true;
        this.candidateTags=candidate.getTagLevelMap();
        this.summ=0;
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

//    public Map<Tag, Level> getEmployeeTags() {
//        return employeeTags;
//    }
    public Map<Tag, Level> getCandidateTags() {
        return candidateTags;
    }


    public void summAdd(double plusSumm){
        this.summ+=plusSumm;
    }

    public double getSumm() {
        return summ;
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

}
