package app.facoris;

import app.models.interfaces.AirPlane;

import java.lang.reflect.InvocationTargetException;

public class AirplaneFactoryImpl implements AirPlaneFactory {
    private static final String PATH = "app.models.";
    @Override
    public AirPlane addAirplane(String model) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (AirPlane) Class.forName(PATH + model)
                .getDeclaredConstructor().newInstance();
    }
}
