package abstractFactoryPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
