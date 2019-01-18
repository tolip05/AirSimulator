package app.commands;

import app.anotations.InjectArgs;
import app.core.ManagementSystem;

public class FlyCommand extends BaseCommand {
    @InjectArgs
     private String[] params;


    public FlyCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute(){
        String model = params[1];
        return super.getManagementSystem().startFly(model);
    }
}
