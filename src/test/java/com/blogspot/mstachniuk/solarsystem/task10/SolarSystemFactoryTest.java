package com.blogspot.mstachniuk.solarsystem.task10;

import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.task07.SolarSystemFactory;
import org.junit.Test;

import java.util.List;

public class SolarSystemFactoryTest {

    /**
     *  Task 10: Poniżej jest zmodyfikowany kod z siódmego zadania.
     *  Wygeneruj assercje za pomocą maven-fest-assertion-generator-plugin tak, aby można było odkommentować sekcję then
     */
    @Test
    public void shouldCreateInnersPlants() {
        // given
        SolarSystemFactory factory = new SolarSystemFactory();

        // when
        List<Planet> innerPlanets = factory.createInnerPlanets();

        // then
//        Planet mercury = innerPlanets.get(0);
//        PlanetAssert.assertThat(mercury)
//                .hasName("Mercury")
//                .hasRotationDirection(RotationDirection.LEFT)
//                .hasDiameter(Distance.createFromMeter(new BigDecimal("4879400")))
//                .hasSiderealYear(new SiderealYear(new BigDecimal("87.96935")))
//                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("47.362"))
//                .hasAcceleration(3.701)
//                .hasAtmosphereGases(Gas.OXYGEN, Gas.SODIUM, Gas.HYDROGEN);
//
//        Planet venus = innerPlanets.get(1);
//        PlanetAssert.assertThat(venus)
//                .hasName("Venus")
//                .hasRotationDirection(RotationDirection.RIGHT)
//                .hasDiameter(Distance.createFromMeter(new BigDecimal("12103700")))
//                .hasSiderealYear(new SiderealYear(new BigDecimal("224.70096")))
//                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("35.02"))
//                .hasAcceleration(8.87)
//                .hasAtmosphereGases(Gas.CARBON_DIOXIDE, Gas.NITROGEN);
//
//        Planet earth = innerPlanets.get(2);
//        PlanetAssert.assertThat(earth)
//                .hasName("Earth")
//                .hasRotationDirection(RotationDirection.LEFT)
//                .hasDiameter(Distance.createFromMeter(new BigDecimal("12756273")))
//                .hasSiderealYear(new SiderealYear(new BigDecimal("365.256363004")))
//                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("29.78"))
//                .hasAcceleration(9.806_65)
//                .hasAtmosphereGases(Gas.NITROGEN, Gas.OXYGEN, Gas.CARBON_DIOXIDE, Gas.ARGON);
//
//        Planet mars = innerPlanets.get(3);
//        PlanetAssert.assertThat(mars)
//                .hasName("Mars")
//                .hasRotationDirection(RotationDirection.LEFT)
//                .hasDiameter(Distance.createFromMeter(new BigDecimal("6804900")))
//                .hasSiderealYear(new SiderealYear(new BigDecimal("686.9601")))
//                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("24.077"))
//                .hasAcceleration(3.69)
//                .hasAtmosphereGases(Gas.CARBON_DIOXIDE, Gas.NITROGEN);
    }

}
