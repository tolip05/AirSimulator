package app.models.choppers;

import app.models.abstracts.BaseChopper;

public class Mi24 extends BaseChopper {

    private static final String MODEL = "Mi24";
    private static final double PRICE = 1000;

    public Mi24(String model, double price) {
        super(MODEL, PRICE);
    }
}
