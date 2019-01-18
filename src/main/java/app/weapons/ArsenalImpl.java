package app.weapons;

import java.util.ArrayList;
import java.util.List;

public class ArsenalImpl implements Arsenal {
    private static final int COUNT = 1000;
    private Weapon[] weapons;

    public ArsenalImpl() {
        this.weapons = new Weapon[COUNT];
        this.initialiaze();
    }

    private void initialiaze() {
        Weapon weapon = new Rockets();
        for (int i = 0; i < this.weapons.length; i++) {
            this.weapons[i] = weapon;
        }
    }

    @Override
    public List<Weapon> giveWeapon(String weponName, int count) {
        List<Weapon>weaponsList = new ArrayList<>();

        for (Weapon weapon : weapons) {
            if (weaponsList.size() >= count){
                break;
            }
            if (weapon.getName().equals(weponName)){
                weaponsList.add(weapon);
            }
        }
        return weaponsList;
    }
}
