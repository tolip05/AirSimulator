package app.core;


import app.models.interfaces.AirPlane;
import app.models.interfaces.Chopper;
import app.models.interfaces.Enemy;

public interface ManagementSystem {

  String getAirForce(AirPlane plane);

  String startFly(String model);

  String loadAirforce(String weaponName, int count, String blowerName);

  String fineAnyEnemy(Enemy target);

  String flyReport();

  String shootTarget(String planeName);
  String getChopper(Chopper chopper);
}
