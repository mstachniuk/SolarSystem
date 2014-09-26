package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import com.blogspot.mstachniuk.solarsystem.task07.SolarSystemFactory;
import org.junit.Test;

import java.util.List;

import static com.blogspot.mstachniuk.solarsystem.task08.PlanetAccelerationMatcher.acceleration;
import static com.blogspot.mstachniuk.solarsystem.task08.PlanetAvgOrbitalSpeedMatcher.avgOrbitalSpeedInKmPerSecond;
import static com.blogspot.mstachniuk.solarsystem.task08.PlanetDiameterMatcher.diameterInMeter;
import static com.blogspot.mstachniuk.solarsystem.task08.PlanetGasHasOnlyMatcher.hasOnlyGases;
import static com.blogspot.mstachniuk.solarsystem.task08.PlanetNameMatcher.name;
import static com.blogspot.mstachniuk.solarsystem.task08.PlanetRotationDirectionMatcher.rotation;
import static com.blogspot.mstachniuk.solarsystem.task08.PlanetYearLongMatcher.yearLongInEarthDays;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SolarSystemFactoryTest {

    /**
     *  Task 08: Poniżej jest zrefaktorowany kod z poprzedniego zadania. Sekcja then jest znacznie czytelniejsza,
     *  ale assertPlanet() jest dalej mało czytelne.
     *  Zrefaktoruj tą metodę tak, aby korzystała z Hamcresta.
     */
    @Test
    public void shouldCreateInnersPlants() {
        // given
        SolarSystemFactory factory = new SolarSystemFactory();

        // when
        List<Planet> innerPlanets = factory.createInnerPlanets();

        // then
        Planet mercury = innerPlanets.get(0);
        assertPlanet(mercury, "Mercury", RotationDirection.LEFT, "4879400", "87.96935", "47.362",
                3.701, Gas.OXYGEN, Gas.SODIUM, Gas.HYDROGEN);

        Planet venus = innerPlanets.get(1);
        assertPlanet(venus, "Venus", RotationDirection.RIGHT, "12103700", "224.70096", "35.02",
                8.87, Gas.CARBON_DIOXIDE, Gas.NITROGEN);

        Planet earth = innerPlanets.get(2);
        assertPlanet(earth, "Earth", RotationDirection.LEFT, "12756273", "365.256363004", "29.78",
                9.806_65, Gas.NITROGEN, Gas.OXYGEN, Gas.CARBON_DIOXIDE, Gas.ARGON);

        Planet mars = innerPlanets.get(3);
        assertPlanet(mars, "Mars", RotationDirection.LEFT, "6804900", "686.9601", "24.077",
                3.69, Gas.CARBON_DIOXIDE, Gas.NITROGEN);
    }

    private void assertPlanet(Planet planet, String planetName, RotationDirection direction, String diameterInMeter,
                              String yearInEarthDays, String avgOrbitalSpeedInKmPerSecond, double acceleration,
                              Gas... atmosphereGases) {
        assertThat(planet, is(name(planetName)));
        assertThat(planet, is(rotation(direction)));
        assertThat(planet, is(diameterInMeter(diameterInMeter)));
        assertThat(planet, is(yearLongInEarthDays(yearInEarthDays)));
        assertThat(planet, is(avgOrbitalSpeedInKmPerSecond(avgOrbitalSpeedInKmPerSecond)));
        assertThat(planet, is(acceleration(acceleration)));
        assertThat(planet, is(hasOnlyGases(atmosphereGases)));
    }
}
