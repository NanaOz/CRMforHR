package managers;

import com.company.Candidate;
import com.company.Human;
import employer.Employee;
import employer.EmployeeHR;

import java.util.HashMap;

public class ManagerHR extends Human {

    public String dateStartTask;  //дата начала задания
    public String dateEndTask;   //дэдлайн
    public String task;          //задание

    public HashMap<String ,EmployeeHR> employeeHRHash;    //список сотрудников HR
    public HashMap<String , Employee> employeeHash;       //список всех сотрудников
    public HashMap<String , Candidate> candidateHash;     //список соискателей

    public String position;    //должность
    public Boolean viewMode=false;   //зона видимости

    public ManagerHR() {
        super();

    }

    public void createAccountHR() {   //создать акк сотрудника

    }

    public void deleteAccountHR() {   //удалить акк сотрудника

    }

    public void selectViews(){      //редактирование зоны видимости

    }

    //    @Override
    public void creatingTask (){}      //создать задачу



}
