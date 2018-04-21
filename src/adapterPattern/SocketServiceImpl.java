package adapterPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class SocketServiceImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return new Volt(120);
    }

    @Override
    public Volt get60Volt() {
        return new Volt(60);
    }
}
