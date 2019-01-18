package app.commands;


import app.anotations.InjectArgs;
import app.core.ManagementSystem;
import app.facoris.AirPlaneFactory;
import app.facoris.AirplaneFactoryImpl;
import app.logger.Handler;
import app.models.F16;
import app.models.interfaces.AirPlane;
import app.models.Mig29;

import java.lang.reflect.InvocationTargetException;

public class GetAirforceCommand extends BaseCommand {

    @InjectArgs
    private String[] params;
    private AirPlaneFactory airPlaneFactory;



    public GetAirforceCommand(ManagementSystem managementSystem) {
        super(managementSystem);
        this.airPlaneFactory = new AirplaneFactoryImpl();
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String type = params[1];
        AirPlane airPlane = this.airPlaneFactory.addAirplane(type);

        return super.getManagementSystem().getAirForce(airPlane);
    }
}
