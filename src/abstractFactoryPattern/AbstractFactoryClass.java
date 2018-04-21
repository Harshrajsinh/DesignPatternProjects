package abstractFactoryPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class AbstractFactoryClass {

    public Shape getShape(ShapeFactory shapeFactory){
        return  shapeFactory.createShape();
    }
}
