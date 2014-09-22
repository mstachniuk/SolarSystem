package com.blogspot.mstachniuk.solarsystem.task07;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SolarSystemFactoryTest {

    /**
     * Task 07: Assercje wyglądają na bardzo rozbudowane i dużo w nich duplikacji kodu.
     * Zrefaktoryzuj kod tak, aby każdy blok dotyczący planety był w jednej metodzie, np.: assertPlanet(mercury, ...)
     */
    @Test
    public void shouldCreateInnersPlants() {
        // given
        SolarSystemFactory factory = new SolarSystemFactory();

        // when
        List<Planet> innerPlanets = factory.createInnerPlanets();

        // then
        Planet mercury = innerPlanets.get(0);
        assertEquals("Mercury", mercury.getName());
        assertEquals(RotationDirection.LEFT, mercury.getRotationDirection());
        assertEquals(new BigDecimal("4879400"), mercury.getDiameter().getMeter());
        assertEquals(0, new BigDecimal("87.96935").compareTo(mercury.getSiderealYear().inEarthDays()));
        assertEquals(3.701, mercury.getAcceleration(), 0.01);
        Set<Gas> mercuryGases = Stream.of(Gas.OXYGEN, Gas.SODIUM, Gas.HYDROGEN).collect(Collectors.toSet());
        assertEquals(mercuryGases, mercury.getAtmosphereGases());

        Planet venus = innerPlanets.get(1);
        assertEquals("Venus", venus.getName());
        assertEquals(RotationDirection.RIGHT, venus.getRotationDirection());
        assertEquals(new BigDecimal((long) 12_103_700), venus.getDiameter().getMeter());
        assertEquals(0, new BigDecimal("224.70096").compareTo(venus.getSiderealYear().inEarthDays()));
        assertEquals(8.87, venus.getAcceleration(), 0.01);
        Set<Gas> venusGases = Stream.of(Gas.CARBON_DIOXIDE, Gas.NITROGEN).collect(Collectors.toSet());
        assertEquals(venusGases, venus.getAtmosphereGases());

        Planet earth = innerPlanets.get(2);
        assertEquals("Earth", earth.getName());
        assertEquals(RotationDirection.LEFT, earth.getRotationDirection());
        assertEquals(new BigDecimal((long) 12_756_273), earth.getDiameter().getMeter());
        assertEquals(0, new BigDecimal("365.256363004").compareTo(earth.getSiderealYear().inEarthDays()));
        assertEquals(9.806_65, earth.getAcceleration(), 0.01);
        Set<Gas> earthGases = Stream.of(Gas.NITROGEN, Gas.OXYGEN, Gas.CARBON_DIOXIDE, Gas.ARGON).collect(Collectors.toSet());
        assertEquals(earthGases, earth.getAtmosphereGases());

        Planet mars = innerPlanets.get(3);
        assertEquals("Mars", mars.getName());
        assertEquals(RotationDirection.LEFT, mars.getRotationDirection());
        assertEquals(new BigDecimal((long) 6_804_900), mars.getDiameter().getMeter());
        assertEquals(0, new BigDecimal("686.9601").compareTo(mars.getSiderealYear().inEarthDays()));
        assertEquals(3.69, mars.getAcceleration(), 0.01);
        Set<Gas> marsGases = Stream.of(Gas.CARBON_DIOXIDE, Gas.NITROGEN).collect(Collectors.toSet());
        assertEquals(marsGases, mars.getAtmosphereGases());

    }

}
