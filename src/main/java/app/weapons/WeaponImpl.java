package app.weapons;

public abstract class WeaponImpl implements Weapon {
    private String name;
    private int power;
    private double price;

    protected WeaponImpl(String name, int power, double price) {
        this.name = name;
        this.power = power;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
