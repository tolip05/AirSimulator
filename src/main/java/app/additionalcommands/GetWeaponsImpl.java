package app.additionalcommands;

import app.weapons.Arsenal;
import app.weapons.Weapon;

import java.util.List;

public class GetWeaponsImpl implements GetWeapons {

    @Override
    public List<Weapon> setWeapon(String weaponName, int count, Arsenal arsenal) {
         return arsenal.giveWeapon(weaponName, count);
    }
}
