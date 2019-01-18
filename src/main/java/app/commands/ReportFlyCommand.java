package app.commands;

import app.core.ManagementSystem;

import java.lang.reflect.InvocationTargetException;


public class ReportFlyCommand extends BaseCommand {

    public ReportFlyCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        return super.getManagementSystem().flyReport();
    }
}
