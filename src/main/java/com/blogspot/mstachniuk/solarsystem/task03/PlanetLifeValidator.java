package com.blogspot.mstachniuk.solarsystem.task03;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;

import java.math.BigDecimal;

public class PlanetLifeValidator {

    private final BigDecimal lightSpeed = new BigDecimal("299792458");  // m/s

    public boolean canBeLife(Planet planet) throws InvalidPlanetSpeed {
        if (planet.getAvgOrbitalSpeed().getMeterPerSecond().compareTo(lightSpeed) > 0) {
            throw new InvalidPlanetSpeed("Speed ist greater than light speed");
        }
        return planet.getAtmosphereGases().contains(Gas.OXYGEN)
                && planet.getAtmosphereGases().contains(Gas.CARBON_DIOXIDE);
    }
}
