package app.players;

import app.models.interfaces.AirPlane;
import app.models.interfaces.Chopper;

import java.util.ArrayList;
import java.util.List;

public class PlayerImpl implements Player {
    private String name;
    private double money;
    private List<AirPlane>airPlanes;
    private List<Chopper>choppers;


    public PlayerImpl(String name, double money) {
        this.name = name;
        this.money = money;
        this.airPlanes = new ArrayList<>();
        this.choppers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<AirPlane> getAirplanes() {
        return this.airPlanes;
    }

    @Override
    public Chopper getChopper(String model) {
        Chopper chopper = this.choppers.stream()
                .filter(a -> a.getModel().equals(model))
                .findFirst().orElse(null);
        return chopper;
    }

    @Override
    public List<Chopper> getChoppers() {
        return this.choppers;
    }

    @Override
    public void addChopper(Chopper chopper) {
        if (this.money < chopper.getPrice()){
            throw new IllegalArgumentException("You not enough money");
        }
        this.setMoney(this.getMoney() - chopper.getPrice());
        this.choppers.add(chopper);
    }

    @Override
    public void addAirplane(AirPlane airPlane) {
        if (this.money < airPlane.getPrice()){
            throw new IllegalArgumentException("You not enough money");
        }
        this.setMoney(this.getMoney() - airPlane.getPrice());
        this.airPlanes.add(airPlane);
    }

    @Override
    public String showMe() {
        return null;
    }

    @Override
    public AirPlane getAirplane(String model) {
        AirPlane airPlane = this.airPlanes.stream()
                .filter(a -> a.getName().equals(model))
                .findFirst().orElse(null);
        return airPlane;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getMoney();
    }


}
