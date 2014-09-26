package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.math.BigDecimal;

public class PlanetDiameterMatcher extends BaseMatcher<Planet> {

    private String diameterInMeter;

    private PlanetDiameterMatcher(String diameterInMeter) {
        this.diameterInMeter = diameterInMeter;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getDiameter().getMeter().compareTo(new BigDecimal(diameterInMeter)) == 0;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Diameter in Meter: " + diameterInMeter);
    }

    public static PlanetDiameterMatcher diameterInMeter(String diameterInMeter) {
        return new PlanetDiameterMatcher(diameterInMeter);
    }
}
