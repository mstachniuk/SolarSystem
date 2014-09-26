package com.blogspot.mstachniuk.solarsystem.task11;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import com.blogspot.mstachniuk.solarsystem.task07.SolarSystemFactory;
import org.junit.Test;

import java.util.List;

import static com.blogspot.mstachniuk.solarsystem.task11.PlanetSetAssert.assertThat;

public class SolarSystemFactoryTest {

    /**
     *  Task 11: Poniżej jest zrefaktorowany kod z siódmego zadania. Sekcja then jest znacznie czytelniejsza,
     *  ale assertPlanet() jest dalej mało czytelne.
     *  Zapisz assercje za pomocą AssertJ.
     */
    @Test
    public void shouldCreateInnersPlants() {
        // given
        SolarSystemFactory factory = new SolarSystemFactory();

        // when
        List<Planet> innerPlanets = factory.createInnerPlanets();

        // then
        assertThat(innerPlanets)
                .containsPlanetWithName3("Mercury")
                .hasRotation(RotationDirection.LEFT)
                .hasDiameterInMeter("4879400")
                .hasYearInEarthDays("87.96935")
                .hasAvgOrbitalSpeedInKmPerSecond("47.362")
                .hasAcceleration(3.701)
                .containsGas(Gas.OXYGEN)
                .containsGas(Gas.SODIUM)
                .containsGas(Gas.HYDROGEN);

        assertThat(innerPlanets)
                .containsPlanetWithName3("Venus")
                .hasRotation(RotationDirection.RIGHT)
                .hasDiameterInMeter("12103700")
                .hasYearInEarthDays("224.70096")
                .hasAvgOrbitalSpeedInKmPerSecond("35.02")
                .hasAcceleration(8.87)
                .containsOnlyGases(Gas.CARBON_DIOXIDE, Gas.NITROGEN);

        assertThat(innerPlanets)
                .containsPlanetWithName3("Earth")
                .hasRotation(RotationDirection.LEFT)
                .hasDiameterInMeter("12756273")
                .hasYearInEarthDays("365.256363004")
                .hasAvgOrbitalSpeedInKmPerSecond("29.78")
                .hasAcceleration(9.806_65)
                .containsGases(Gas.NITROGEN, Gas.OXYGEN)
                .doesNotContainGases(Gas.SODIUM);

        assertThat(innerPlanets)
                .containsPlanetWithName3("Mars")
                .hasRotation(RotationDirection.LEFT)
                .hasDiameterInMeter("6804900")
                .hasYearInEarthDays("686.9601")
                .hasAvgOrbitalSpeedInKmPerSecond("24.077")
                .hasAcceleration(3.69)
                .containsGases(Gas.CARBON_DIOXIDE, Gas.NITROGEN)
                .doesNotContainGases(Gas.OXYGEN);

        assertThat(innerPlanets)
                .containsOnlyPlanets("Mercury", "Venus", "Earth", "Mars");
    }
}
