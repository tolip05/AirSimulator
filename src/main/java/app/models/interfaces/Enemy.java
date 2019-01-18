package app.models.interfaces;

public interface Enemy {
   void receiveDamage(int dmg);
   boolean isDead();
   void attackEnemy();
   double giveMoney();
}
