package app.additionalcommands;

import app.additionalcommands.SelectAirplanesIsFly;
import app.models.interfaces.AirPlane;
import app.players.Player;

import java.util.List;
import java.util.stream.Collectors;

public class SelectAirplanesIsFlyImpl implements SelectAirplanesIsFly {
    @Override
    public List<AirPlane> getAirPlanesWhoIsFly(Player player) {
        return player.getAirplanes().stream()
                .filter(AirPlane::isFly).collect(Collectors.toList());
    }
}
