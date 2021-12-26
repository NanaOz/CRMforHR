package employer;

import models.User;

public class Employee extends User {

    private String status;  // статус "работает", "уволен", "не работает", "приглашен на собеседование"
    private String post;    // должность??? (у кандидатов - претендует на должность)?или выносим в HR и Candidate?
    private String skills;  //навыки


    public Employee() {
        super();
    }
}
