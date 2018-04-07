package prototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class Employee {

    List<String> empList;

    public Employee(){
        empList = new ArrayList<>();
    }

    public List<String> getEmpLst(){
        return empList;
    }

    public List<String> loadData(List<String> empList){
        empList.add("Harsh");
        empList.add("Ruby");
        return empList;
    }

    
}
