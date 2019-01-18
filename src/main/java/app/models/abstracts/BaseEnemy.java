package app.models.abstracts;

import app.models.interfaces.Enemy;

public abstract class BaseEnemy implements Enemy {
    private int health;
    private double money;
    private int power;

    public BaseEnemy(int health, double money, int power) {
        this.health = health;
        this.money = money;
        this.power = power;
    }

    @Override
    public boolean isDead() {
        return this.health <= 0;
    }

    @Override
    public void receiveDamage(int dmg) {
        this.health -= dmg;
    }
    @Override
    public void attackEnemy() {

    }
}
