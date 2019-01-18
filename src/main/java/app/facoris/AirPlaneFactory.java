package app.facoris;

import app.models.interfaces.AirPlane;

import java.lang.reflect.InvocationTargetException;

public interface AirPlaneFactory {
    AirPlane addAirplane(String model) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
