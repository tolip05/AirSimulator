package app.interpriters;

import app.commands.Executable;

import java.lang.reflect.InvocationTargetException;

public interface Interpreter {
    Executable interpretCommand(String line) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException
            , InvocationTargetException, InstantiationException;
}
