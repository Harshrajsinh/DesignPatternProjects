package adapterPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public interface SocketAdapter {

    Volt get120Volt();

    Volt get60Volt();

    Volt get3Volt();
}
