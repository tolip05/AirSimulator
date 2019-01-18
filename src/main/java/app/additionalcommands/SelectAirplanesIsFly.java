package app.additionalcommands;

import app.models.interfaces.AirPlane;
import app.players.Player;

import java.util.List;

public interface SelectAirplanesIsFly {
    List<AirPlane> getAirPlanesWhoIsFly(Player player);
}
