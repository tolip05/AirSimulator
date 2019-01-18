package app.additionalcommands;

import app.models.interfaces.AirPlane;

public class IsFlyImpl implements IsFly {
    @Override
    public boolean isFly(AirPlane plane) {
        return plane.fly();
    }
}
