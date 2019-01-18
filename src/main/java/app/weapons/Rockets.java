package app.weapons;

public class Rockets extends WeaponImpl {

    private static final String NAME = "Air_air";
    private static final int POWER = 50;
    private static final double PRICE = 50;

    public Rockets() {
        super(NAME, POWER,PRICE);

    }

    @Override
    public double getPrice() {
        return PRICE;
    }
}
