package app.additionalcommands;

import app.constants.Constant;
import app.models.interfaces.AirPlane;

public class PrintIsFlyingImpl implements PrintIsFlying {

    @Override
    public String print(boolean isFly, AirPlane plane) {
        String result;
        if (isFly) {
            result = String.format("Your %s is flying!", plane);
        } else {
            result = String.format(Constant.AIRPLANE_IS_ALREDY_FLYING, plane);
        }
        return result;
    }
}
