package app.facoris;

import app.models.interfaces.Chopper;

import java.lang.reflect.InvocationTargetException;

public class ChopperFactoryImpl implements ChopperFactory {
    private static final String PATH = "app.models.choppers.";

    @Override
    public Chopper createChopper(String model) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (Chopper) Class.forName(PATH + model)
                .getDeclaredConstructor().newInstance();
    }
}
