package com.blogspot.mstachniuk.solarsystem.task01;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import com.blogspot.mstachniuk.solarsystem.SiderealYear;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import com.blogspot.mstachniuk.solarsystem.vo.Speed;

import java.math.BigDecimal;
import java.util.Set;

public class PlanetBuilder {
    private Speed avgOrbitalSpeed;     // średnia prędkość orbitalna
    private double acceleration;        // przyspieszenie
    private Set<Gas> atmosphereGases;
    private String name;
    private RotationDirection rotationDirection;
    private Distance diameter;              // średnica
    private SiderealYear siderealYear;  // rok gwiezdny

    private PlanetBuilder() {
    }

    public static PlanetBuilder aPlanet() {
        return new PlanetBuilder();
    }

    public PlanetBuilder avgOrbitalSpeedInKmPerSecond(String avgOrbitalSpeed) {
        this.avgOrbitalSpeed = Speed.createKmPerSecond(avgOrbitalSpeed);
        return this;
    }

    public PlanetBuilder siderealYearInEarthDays(String siderealYear) {
        this.siderealYear = new SiderealYear(new BigDecimal(siderealYear));
        return this;
    }

    public PlanetBuilder acceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public PlanetBuilder atmosphereGases(Set<Gas> atmosphereGases) {
        this.atmosphereGases = atmosphereGases;
        return this;
    }

    public PlanetBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PlanetBuilder rotationDirection(RotationDirection rotationDirection) {
        this.rotationDirection = rotationDirection;
        return this;
    }

    public PlanetBuilder diameter(Distance diameter) {
        this.diameter = diameter;
        return this;
    }

    public Planet build() {
        Planet planet = new Planet(name, rotationDirection, diameter, siderealYear);
        planet.setAvgOrbitalSpeed(avgOrbitalSpeed);
        planet.setAcceleration(acceleration);
        planet.setAtmosphereGases(atmosphereGases);
        return planet;
    }
}
