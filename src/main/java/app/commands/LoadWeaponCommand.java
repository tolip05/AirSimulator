package app.commands;

import app.anotations.InjectArgs;
import app.core.ManagementSystem;

public class LoadWeaponCommand extends BaseCommand {

    @InjectArgs
    private String[] params;

    public LoadWeaponCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute(){
        String weaponName = params[1];
        int count = Integer.parseInt(params[2]);
        String airplane = params[3];

       return super.getManagementSystem()
               .loadAirforce(weaponName,count,airplane);

    }
}
