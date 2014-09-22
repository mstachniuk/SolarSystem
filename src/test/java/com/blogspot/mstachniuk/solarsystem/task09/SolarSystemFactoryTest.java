package com.blogspot.mstachniuk.solarsystem.task09;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import com.blogspot.mstachniuk.solarsystem.task07.SolarSystemFactory;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SolarSystemFactoryTest {

    /**
     *  Task 09: Poniżej jest zrefaktorowany kod z siódmego zadania. Sekcja then jest znacznie czytelniejsza,
     *  ale assertPlanet() jest dalej mało czytelne.
     *  Zrefaktoruj test tak, aby korzystał z FEST Assert 2.X.
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
        assertEquals(planetName, planet.getName());
        assertEquals(direction, planet.getRotationDirection());
        assertEquals(0, new BigDecimal(diameterInMeter).compareTo(planet.getDiameter().getMeter()));
        assertEquals(0, new BigDecimal(yearInEarthDays).compareTo(planet.getSiderealYear().inEarthDays()));
        assertEquals(0, new BigDecimal(avgOrbitalSpeedInKmPerSecond).compareTo(planet.getAvgOrbitalSpeed().getKmPerSecond()));
        assertEquals(acceleration, planet.getAcceleration(), 0.01);
        Set<Gas> expectedGases = Stream.of(atmosphereGases).collect(Collectors.toSet());
        assertEquals(expectedGases, planet.getAtmosphereGases());
    }
}
