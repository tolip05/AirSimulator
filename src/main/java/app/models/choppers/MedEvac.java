package app.models.choppers;

import app.models.abstracts.BaseChopper;

public class MedEvac extends BaseChopper {

    private static final String MODEL = "MedeVac";
    private static final double PRICE = 10_000;

    public MedEvac() {
        super(MODEL, PRICE);
    }
}
