package app.models;

import app.logger.Handler;
import app.models.abstracts.BaseAirplane;
import app.models.interfaces.Enemy;
import app.weapons.Weapon;

import java.util.List;

public class F16 extends BaseAirplane {


    private static final String MODEL = "F16";
    private static final int POWER = 70;
    private static final double OIL = 100;
    private static final double PRICE = 1000;
    private double price;

    public F16() {
        super(MODEL, POWER, OIL);
        this.price = PRICE;
    }


    public double getPrice() {
        return this.price;
    }




}
