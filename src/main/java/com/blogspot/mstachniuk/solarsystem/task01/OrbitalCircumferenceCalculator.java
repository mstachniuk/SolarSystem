package com.blogspot.mstachniuk.solarsystem.task01;

import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;

import java.math.BigDecimal;

public class OrbitalCircumferenceCalculator {

    public Distance calculate(Planet planet) {
        BigDecimal orbital = planet.getAvgOrbitalSpeed().getKmPerSecond()
                .multiply(planet.getSiderealYear().inSeconds());
        return Distance.createFromKM(orbital);
    }
}
