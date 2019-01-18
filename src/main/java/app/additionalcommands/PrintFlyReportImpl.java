package app.additionalcommands;

import app.models.interfaces.AirPlane;

import java.util.List;

public class PrintFlyReportImpl implements PrintFlyReport {
    @Override
    public String result(List<AirPlane> planes) {
        String result;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("You have %d planes on the air.", planes.size()))
                .append(System.lineSeparator());
        planes.stream().forEach(p -> {
            sb.append(p.getName()).append(System.lineSeparator());
        });
        result = sb.toString();
        return result;
    }
}
