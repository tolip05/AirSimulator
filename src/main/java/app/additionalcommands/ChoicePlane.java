package app.additionalcommands;

import app.models.interfaces.AirPlane;
import app.players.Player;

public interface ChoicePlane {
    AirPlane getAirplane(Player player,String name);
}
