package com.blogspot.mstachniuk.solarsystem.task07;

import com.blogspot.mstachniuk.solarsystem.*;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import com.blogspot.mstachniuk.solarsystem.vo.Speed;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolarSystemFactory {

    public List<Planet> createInnerPlanets() {
        List<Planet> innerPlanets = new ArrayList<>();

        Planet mercury = new Planet("Mercury", RotationDirection.LEFT,
                Distance.createFromMeter(new BigDecimal("4879400")), new SiderealYear(new BigDecimal("87.96935")));
        mercury.setAcceleration(3.701);
        mercury.setAvgOrbitalSpeed(Speed.createKmPerSecond("47.362"));
        Set<Gas> mercuryGases = Stream.of(Gas.OXYGEN, Gas.SODIUM, Gas.HYDROGEN).collect(Collectors.toSet());
        mercury.setAtmosphereGases(mercuryGases);
        innerPlanets.add(mercury);

        Planet venus = new Planet("Venus", RotationDirection.RIGHT,
                Distance.createFromMeter(new BigDecimal("12103700")), new SiderealYear(new BigDecimal("224.70096")));
        venus.setAcceleration(8.87);
        venus.setAvgOrbitalSpeed(Speed.createKmPerSecond("35.02"));
        Set<Gas> venusGases = Stream.of(Gas.CARBON_DIOXIDE, Gas.NITROGEN).collect(Collectors.toSet());
        venus.setAtmosphereGases(venusGases);
        innerPlanets.add(venus);

        Planet earth = new Planet("Earth", RotationDirection.LEFT,
                Distance.createFromMeter(new BigDecimal("12756273")), new SiderealYear(new BigDecimal("365.256363004")));
        earth.setAcceleration(9.806_65);
        earth.setAvgOrbitalSpeed(Speed.createKmPerSecond("29.78"));
        Set<Gas> earthGases = Stream.of(Gas.NITROGEN, Gas.OXYGEN, Gas.ARGON, Gas.CARBON_DIOXIDE).collect(Collectors.toSet());
        earth.setAtmosphereGases(earthGases);
        innerPlanets.add(earth);

        Planet mars = new Planet("Mars", RotationDirection.LEFT,
                Distance.createFromMeter(new BigDecimal("6804900")), new SiderealYear(new BigDecimal("686.9601")));
        mars.setAcceleration(3.69);
        mars.setAvgOrbitalSpeed(Speed.createKmPerSecond("24.077"));
        Set<Gas> marsGases = Stream.of(Gas.CARBON_DIOXIDE, Gas.NITROGEN).collect(Collectors.toSet());
        mars.setAtmosphereGases(marsGases);
        innerPlanets.add(mars);

        return innerPlanets;
    }
}
