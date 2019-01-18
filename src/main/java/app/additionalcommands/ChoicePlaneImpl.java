package app.additionalcommands;

import app.models.interfaces.AirPlane;
import app.players.Player;

public class ChoicePlaneImpl implements ChoicePlane {
    @Override
    public AirPlane getAirplane(Player player,String airPlaneName) {
        AirPlane fighter = player.getAirplanes().stream()
                .filter(b -> b.getName().equals(airPlaneName))
                .findFirst().orElse(null);
        return fighter;
    }
}
