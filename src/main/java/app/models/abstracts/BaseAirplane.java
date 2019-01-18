package app.models.abstracts;

import app.constants.Constant;
import app.io.ConsoleWriter;
import app.io.Writer;
import app.logger.Handler;
import app.logger.LogType;
import app.models.interfaces.AirPlane;
import app.models.interfaces.Enemy;
import app.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAirplane implements AirPlane {
    private String model;
    private int power;
    private double oil;
    private boolean isFly;
    private boolean isArmed;
    private boolean haveOil;
    private Enemy enemy;
    private List<Weapon> weapons;
    private Writer writer;

    protected BaseAirplane(String model, int power, double oil) {
        this.model = model;
        this.power = power;
        this.oil = oil;
        this.isFly = false;
        this.isArmed = false;
        this.haveOil = false;
        this.writer = new ConsoleWriter();
        this.weapons = new ArrayList<>();
    }

    @Override
    public boolean setTarget(Enemy target) {
        if (target == null){
        return false;
        }
      this.enemy = target;
        return true;
    }

    @Override
    public void attack() {

    }

    @Override
    public boolean fly(){
            if (this.isFly()){
                return false;
            }
                this.isFly = true;
            return true;
        }

    protected List<Weapon> getWeapons() {
        return this.weapons;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isFly() {
        return this.isFly;
    }

    @Override
    public String getName()
    {
        return this.model;
    }

    @Override
    public void setWeapons(List<Weapon> weapons) {
        for (Weapon weapon : weapons) {
            this.weapons.add(weapon);
        }
    }

    @Override
    public int getSizeWeapons() {
        return this.weapons.size();
    }



    @Override
    public void removeWeapon() {
        if (this.weapons.size() > 0){
            this.weapons.remove(0);
        }

    }

    @Override
    public String toString() {
        return this.getName();
    }
}
