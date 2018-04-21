import FacadePattern.FacadeHelperClass;
import abstractFactoryPattern.AbstractFactoryClass;
import abstractFactoryPattern.CircleFactory;
import adapterPattern.SocketAdapter;
import adapterPattern.SocketServiceImpl;
import adapterPattern.Volt;
import builderPattern.Computer;
import factoryPattern.FactoryClass;
import factoryPattern.Shape;
import singletonClassPattern.SingletonClass;
import prototypePattern.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class MainClass {

    //for prototype design Pattern
    static List<String> empList = new ArrayList<>();

    public static void main(String[] args) throws CloneNotSupportedException {
        singletonClassDesignPatternExample();
        prototypeDesignPatternExample();
        factoryDesignPattern("rectangle");
        abstractFactoryDesignPattern();
        builderPattern();
        adapterPattern();
        facadePattern();
    }

    public static void singletonClassDesignPatternExample(){
        System.out.println(SingletonClass.getInstance());
    }

    public static void prototypeDesignPatternExample() throws CloneNotSupportedException {
        Employee employee1 = new Employee();
        employee1.loadData();

        Employee employeeCopy2 = employee1.clone();
        empList = employeeCopy2.getEmpList();
        empList.add("Thakor");
        System.out.println(employee1.getEmpList());
        System.out.println(empList);
    }

    public static void factoryDesignPattern(String shapeString){
        FactoryClass factoryClass = new FactoryClass();
        Shape shape = factoryClass.getShape(shapeString);
        shape.writeNameOfShape();
    }

    public static void abstractFactoryDesignPattern(){
        AbstractFactoryClass abstractFactoryClass = new AbstractFactoryClass();
        abstractFactoryPattern.Shape shape = abstractFactoryClass.getShape(new CircleFactory());
        System.out.println(shape.shapeName());
    }

    public static void builderPattern(){
        Computer computer = new Computer.ComputerBuilder("16 GB","1 TB").build();
        System.out.println(computer.ram+" "+computer.hdd+" "+computer.graphicsCard);
    }

    public static void adapterPattern(){
        SocketAdapter socketAdapter = new SocketServiceImpl();
        Volt volt = socketAdapter.get3Volt();
        System.out.println(volt.getVolts());
    }

    public static void facadePattern(){
        System.out.println(FacadeHelperClass.mySQLData(FacadeHelperClass.DBTYPES.MYSQL,"tableName"));
    }
}
