package app.additionalcommands;

import app.models.interfaces.AirPlane;

import java.util.List;

public interface PrintFlyReport {
    String result(List<AirPlane> planes);
}
