package app.players;


import app.models.interfaces.AirPlane;
import app.models.interfaces.Chopper;

import java.util.List;

public interface Player {
    void addAirplane(AirPlane airPlane);
    String showMe();
    AirPlane getAirplane(String model);
    List<AirPlane> getAirplanes();
    Chopper getChopper(String model);
    List<Chopper> getChoppers();
    void addChopper(Chopper chopper);
    void setMoney(double money);
    double getMoney();
}
