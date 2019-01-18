package app.commands;

import app.anotations.InjectArgs;
import app.core.ManagementSystem;
import app.facoris.ChopperFactory;
import app.facoris.ChopperFactoryImpl;
import app.models.interfaces.Chopper;

import java.lang.reflect.InvocationTargetException;

public class GetChopperCommand extends BaseCommand {

    private ChopperFactory chopperFactory;
    @InjectArgs
    private String[] params;

    public GetChopperCommand(ManagementSystem managementSystem) {
        super(managementSystem);
        this.chopperFactory = new ChopperFactoryImpl();
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String model = params[1];
        Chopper chopper = this.chopperFactory.createChopper(model);
        return super.getManagementSystem().getChopper(chopper);
    }
}
