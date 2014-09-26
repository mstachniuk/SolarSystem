package com.blogspot.mstachniuk.solarsystem.task03;

import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import com.blogspot.mstachniuk.solarsystem.SiderealYear;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import com.blogspot.mstachniuk.solarsystem.vo.Speed;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.fail;

public class PlanetLifeValidatorTest {

    /**
     *  Task 03: Testowanie wyjątków jest problematyczne. Nie wiadomo gdzie umieścić when i then i ten brzydki
     *  assertTrue(true)...
     *  Zrefaktoruj poniższy test, aby był bardziej czytelny.
     *  Wykorzystaj do tego celu expected w @Test
     */
    @Test(expected = InvalidPlanetSpeed.class)
    public void shouldThrowExceptionWhenAvgOrbitalSpeedIsGreaterThanLightSpeed() throws InvalidPlanetSpeed {
        // given
        PlanetLifeValidator validator = new PlanetLifeValidator();
        Planet planet = examplePlanet();
        planet.setAvgOrbitalSpeed(Speed.createKmPerSecond("310000")); // Greater Than 299 792 458 m/s

        // when
        validator.canBeLife(planet);

        // then
        fail("It should throw Exception, because planet orbital speed can't be greater than light speed");
    }

    private Planet examplePlanet() {
        return new Planet("Very Speed Planet", RotationDirection.LEFT,
                Distance.createFromMeter(new BigDecimal("4879400")),
                new SiderealYear(new BigDecimal("87.96935")));
    }
}
