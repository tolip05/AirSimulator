package app.models.abstracts;

import app.models.interfaces.Chopper;
import app.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseChopper implements Chopper {
    private String model;
    private double price;
    private boolean isFly;
    private List<Weapon> weapons;

    protected BaseChopper(String model, double price) {
        this.model = model;
        this.price = price;
        this.isFly = false;
        this.weapons = new ArrayList<>();
    }


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isFly() {
        return this.isFly;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return this.getModel();
    }
}
