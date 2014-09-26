package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

import java.math.BigDecimal;

public class PlanetAvgOrbitalSpeedMatcher extends BaseMatcher<Planet> {

    private final String speedInKmPerSecond;

    private PlanetAvgOrbitalSpeedMatcher(String speedInKmPerSecond) {
        this.speedInKmPerSecond = speedInKmPerSecond;
    }

    @Override
    public boolean matches(Object item) {
        Planet planet = (Planet) item;
        return planet.getAvgOrbitalSpeed().getKmPerSecond().compareTo(new BigDecimal(speedInKmPerSecond)) == 0;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("avg orbital speed ").appendValue(speedInKmPerSecond).appendText(" KM/s");
    }

    @Factory
    public static PlanetAvgOrbitalSpeedMatcher avgOrbitalSpeedInKmPerSecond(String speedInKmPerSecond) {
        return new PlanetAvgOrbitalSpeedMatcher(speedInKmPerSecond);
    }
}
