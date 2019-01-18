package app.additionalcommands;

import app.models.interfaces.AirPlane;
import app.models.interfaces.Enemy;

import java.util.List;

public interface KillTheEnemy {
    String shoot(List<Enemy> enemies, AirPlane plane,Enemy target);
}
