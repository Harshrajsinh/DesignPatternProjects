package prototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class Employee implements Cloneable {

    List<String> empList;

    public Employee(){
        empList = new ArrayList<>();
    }

    public Employee(List<String> empList){
        this.empList = empList;
    }


    public List<String> getEmpList(){
        return empList;
    }

    public void loadData(){
        empList.add("Harsh");
        empList.add("Ruby");
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>();
        for (String s: this.empList) {
            tempList.add(s);
        }
        return new Employee(tempList);
    }

}
