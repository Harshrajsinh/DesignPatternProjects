package abstractFactoryPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
