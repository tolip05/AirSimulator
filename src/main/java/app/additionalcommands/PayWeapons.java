package app.additionalcommands;

import app.players.Player;
import app.weapons.Weapon;

import java.util.List;

public interface PayWeapons {
    void payWeapon(Player player, List<Weapon> weapons);
}
