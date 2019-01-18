package app.commands;

import app.anotations.InjectArgs;
import app.core.ManagementSystem;

import java.lang.reflect.InvocationTargetException;

public class KillTargetCommand extends BaseCommand {

    @InjectArgs
    private String[] params;

    public KillTargetCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String planeName = params[1];
        return super.getManagementSystem().shootTarget(planeName);
    }
}
