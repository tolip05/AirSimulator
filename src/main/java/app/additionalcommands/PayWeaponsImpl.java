package app.additionalcommands;

import app.players.Player;
import app.weapons.Weapon;

import java.util.List;

public class PayWeaponsImpl implements PayWeapons {
    @Override
    public void payWeapon(Player player, List<Weapon> weapons) {
        double price = 0D;
        for (Weapon weapon : weapons) {
            price += weapon.getPrice();
        }
        player.setMoney(player.getMoney() - price);
    }
}
