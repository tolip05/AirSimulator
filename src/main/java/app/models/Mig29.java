package app.models;

import app.logger.Handler;
import app.models.abstracts.BaseAirplane;

public class Mig29 extends BaseAirplane {

    private static final String MODEL = "Mig29";
    private static final int POWER = 100;
    private static final double OIL = 100;
    private static final double PRICE = 750;
    private double price;

    public Mig29() {
        super(MODEL, POWER, OIL);
        this.price = PRICE;
    }


    public double getPrice() {
        return this.price;
    }


}
