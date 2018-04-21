package singletonClassPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class SingletonClass {

    private  SingletonClass(){};

    public static class SingletonStaticClass{
        public static  SingletonClass singletonClass = new SingletonClass();
    }
    public static SingletonClass getInstance(){
        return SingletonStaticClass.singletonClass;
    }
}
