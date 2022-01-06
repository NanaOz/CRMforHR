package com.company;

import models.Candidate;
import models.Employee;
import models.EmployeeHR;

import java.util.Date;

public class Task {
    public Date dateStartTask;          //дата начала задания
    public Date dateEndTask;            //дэдлайн
    public Date dateActualCompletion;   //даат фактического завершения
    public String task;                 //задание
    public String status;               //статус "выполнено", "не выполнено"

    public Employee employee;
    public EmployeeHR employeeHR;              //исполнители
    public Candidate candidate;

    public void creatingTask (){}       //создать задачу
}
