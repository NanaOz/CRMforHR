package com.company;

import employer.Employee;
import employer.EmployeeHR;

import java.util.Date;
import java.util.HashMap;

public class Task {
    public Date dateStartTask;          //дата начала задания
    public Date dateEndTask;            //дэдлайн
    public Date dateActualCompletion;   //даат фактического завершения
    public String task;                 //задание
    public String status;               //статус "выполнено", "не выполнено"

    Employee employee;
    EmployeeHR employeeHR;              //нужны?
    Candidate candidate;

    public void creatingTask (){}       //создать задачу
}
