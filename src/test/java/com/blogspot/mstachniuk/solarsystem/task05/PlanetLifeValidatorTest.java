package com.blogspot.mstachniuk.solarsystem.task05;

import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import com.blogspot.mstachniuk.solarsystem.SiderealYear;
import com.blogspot.mstachniuk.solarsystem.task03.InvalidPlanetSpeed;
import com.blogspot.mstachniuk.solarsystem.task03.PlanetLifeValidator;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import com.blogspot.mstachniuk.solarsystem.vo.Speed;
import org.junit.Test;

import java.math.BigDecimal;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertEquals;

public class PlanetLifeValidatorTest {

    /**
     *  Task 05: Testowanie wyjątków jest problematyczne. Nie wiadomo gdzie umieścić when i then i ten brzydki
     *  assertTrue(true)...
     *  Zrefaktoruj poniższy test, aby był bardziej czytelny.
     *  Wykorzystaj do tego celu catch-Exception
     */
    @Test
    public void shouldThrowExceptionWhenAvgOrbitalSpeedIsGreaterThanLightSpeed() throws InvalidPlanetSpeed {
        // given
        PlanetLifeValidator validator = new PlanetLifeValidator();
        Planet planet = examplePlanet();
        planet.setAvgOrbitalSpeed(Speed.createKmPerSecond("310000")); // Greater Than 299 792 458 m/s

        // when
        catchException(validator).canBeLife(planet);

        // then
        assertEquals(InvalidPlanetSpeed.class, caughtException().getClass());
    }

    private Planet examplePlanet() {
        return new Planet("Very Speed Planet", RotationDirection.LEFT,
                Distance.createFromMeter(new BigDecimal("4879400")),
                new SiderealYear(new BigDecimal("87.96935")));
    }
}
