package factoryPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class FactoryClass {
    public Shape getShape(String shape){
        switch (shape.toLowerCase()){
            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            default:
                return null;
        }
    }
}
