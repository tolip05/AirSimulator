package app.models;

import app.models.abstracts.BaseEnemy;

import java.util.zip.DeflaterOutputStream;

public class Intruder extends BaseEnemy {

    private static final int HEALTH = 20;
    private static final double MONEY = 500;
    private static final int POWER = 15;


    public Intruder() {
        super(HEALTH, MONEY, POWER);
    }


    @Override
    public double giveMoney() {
        return MONEY;
    }
}
