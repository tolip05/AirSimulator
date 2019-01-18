package app.additionalcommands;

import app.models.interfaces.AirPlane;
import app.models.interfaces.Enemy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KillTheEnemyImpl implements KillTheEnemy {
    private static final int COUNT = 3;
    private Random random;
    private int[] points;

    public KillTheEnemyImpl() {
        this.random = new Random();
        this.points = new int[COUNT];
        this.initializePoints();
    }

    private void initializePoints() {
        for (int i = 0; i < this.points.length; i++) {
            this.points[i] = i + 1;
        }
    }

    @Override
    public String shoot(List<Enemy> enemies, AirPlane plane, Enemy target) {

        String result;
        int goal = this.random.nextInt(COUNT + 2);
        plane.removeWeapon();
        for (int point : points) {
            if (point == goal){
              enemies.remove(target);
  //            result = "The target is killed!";
            }
        }
        if(enemies.contains(target)){
            result = "Target is alive!";
        }else{
            result = "The target is killed!";
        }
        return result;
    }
}
