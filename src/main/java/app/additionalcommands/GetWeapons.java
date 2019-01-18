package app.additionalcommands;

import app.weapons.Arsenal;
import app.weapons.Weapon;

import java.util.List;

public interface GetWeapons {
    List<Weapon>setWeapon(String weaponName, int count, Arsenal arsenal);
}
