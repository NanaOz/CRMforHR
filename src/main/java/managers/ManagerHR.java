package managers;

import com.company.Candidate;
import com.company.Human;
import employer.Employee;
import employer.EmployeeHR;

import java.util.HashMap;

public class ManagerHR extends Human {

    public String dateStartTask;
    public String dateEndTask;
    public String task;

    public HashMap<String ,EmployeeHR> employeeHRHash;
    public HashMap<String , Employee> employeeHash;
    public HashMap<String , Candidate> candidateHash;

    public String position;
    public Boolean viewMode=false;

    public ManagerHR() {
        super();

    }


    public void createAccountHR() {

    }

    public void deleteAccountHR() {

    }

    public void createTask(){

    }



    public void selectViews(){

    }


}
