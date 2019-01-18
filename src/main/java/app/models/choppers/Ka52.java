package app.models.choppers;

import app.models.abstracts.BaseChopper;

public class Ka52 extends BaseChopper {
    private static final String MODEL = "Ka52";
    private static final double PRICE = 1000;

    public Ka52() {
        super(MODEL, PRICE);
    }
}
