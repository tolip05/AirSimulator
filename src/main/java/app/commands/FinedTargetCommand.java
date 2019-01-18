package app.commands;


import app.core.ManagementSystem;
import app.models.Intruder;
import app.models.interfaces.Enemy;


public class FinedTargetCommand extends BaseCommand {

    public FinedTargetCommand(ManagementSystem managementSystem) {
        super(managementSystem);
    }

    @Override
    public String execute(){
        Enemy enemy = new Intruder();

        return super.getManagementSystem().fineAnyEnemy(enemy);
    }
}
