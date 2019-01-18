package app.facoris;

import app.models.interfaces.Chopper;

import java.lang.reflect.InvocationTargetException;

public interface ChopperFactory {
    Chopper createChopper(String nodel) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
