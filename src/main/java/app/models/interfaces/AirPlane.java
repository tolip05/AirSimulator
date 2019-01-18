package app.models.interfaces;

import app.weapons.Weapon;

import java.util.List;

public interface AirPlane {
    boolean setTarget(Enemy target);
    void attack();
    boolean fly();
    double getPrice();
    boolean isFly();
    String getName();
    public void setWeapons(List<Weapon> weapons);
 //   boolean isArmed();
    void removeWeapon();
    int getSizeWeapons();
}
