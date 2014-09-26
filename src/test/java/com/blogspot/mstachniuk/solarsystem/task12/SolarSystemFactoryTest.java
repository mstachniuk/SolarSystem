package com.blogspot.mstachniuk.solarsystem.task12;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import com.blogspot.mstachniuk.solarsystem.SiderealYear;
import com.blogspot.mstachniuk.solarsystem.task07.SolarSystemFactory;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import com.blogspot.mstachniuk.solarsystem.vo.Speed;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static com.blogspot.mstachniuk.solarsystem.Assertions.assertThat;

public class SolarSystemFactoryTest {

    /**
     *  Task 12: Poniżej jest zmodyfikowany kod z siódmego zadania.
     *  Wygeneruj assercje za pomocą assertj-assertions-generator-maven-plugin tak,
     *  aby można było odkommentować sekcję then
     */
    @Test
    public void shouldCreateInnersPlants() {
        // given
        SolarSystemFactory factory = new SolarSystemFactory();

        // when
        List<Planet> innerPlanets = factory.createInnerPlanets();

        // then
        Planet mercury = innerPlanets.get(0);
        assertThat(mercury)
                .hasName("Mercury")
                .hasRotationDirection(RotationDirection.LEFT)
                .hasDiameter(Distance.createFromMeter(new BigDecimal("4879400")))
                .hasSiderealYear(new SiderealYear(new BigDecimal("87.96935")))
                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("47.362"))
                .hasAcceleration(3.701, 0.00001)
                .hasAtmosphereGases(Gas.OXYGEN, Gas.SODIUM, Gas.HYDROGEN);

        Planet venus = innerPlanets.get(1);
        assertThat(venus)
                .hasName("Venus")
                .hasRotationDirection(RotationDirection.RIGHT)
                .hasDiameter(Distance.createFromMeter(new BigDecimal("12103700")))
                .hasSiderealYear(new SiderealYear(new BigDecimal("224.70096")))
                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("35.02"))
                .hasAcceleration(8.87, 0.00001)
                .hasAtmosphereGases(Gas.CARBON_DIOXIDE, Gas.NITROGEN);

        Planet earth = innerPlanets.get(2);
        assertThat(earth)
                .hasName("Earth")
                .hasRotationDirection(RotationDirection.LEFT)
                .hasDiameter(Distance.createFromMeter(new BigDecimal("12756273")))
                .hasSiderealYear(new SiderealYear(new BigDecimal("365.256363004")))
                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("29.78"))
                .hasAcceleration(9.806_65, 0.00001)
                .hasAtmosphereGases(Gas.NITROGEN, Gas.OXYGEN, Gas.CARBON_DIOXIDE, Gas.ARGON);

        Planet mars = innerPlanets.get(3);
        assertThat(mars)
                .hasName("Mars")
                .hasRotationDirection(RotationDirection.LEFT)
                .hasDiameter(Distance.createFromMeter(new BigDecimal("6804900")))
                .hasSiderealYear(new SiderealYear(new BigDecimal("686.9601")))
                .hasAvgOrbitalSpeed(Speed.createKmPerSecond("24.077"))
                .hasAcceleration(3.69, 0.00001)
                .hasAtmosphereGases(Gas.CARBON_DIOXIDE, Gas.NITROGEN);
    }

}
