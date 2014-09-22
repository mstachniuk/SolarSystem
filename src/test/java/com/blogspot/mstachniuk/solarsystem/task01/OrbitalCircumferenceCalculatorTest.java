package com.blogspot.mstachniuk.solarsystem.task01;

import com.blogspot.mstachniuk.solarsystem.*;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import com.blogspot.mstachniuk.solarsystem.vo.Speed;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class OrbitalCircumferenceCalculatorTest {

    /**
     * Task 01: Tworzenie przykladowej planety na potrzeby testu jest trochę trudne.
     * Uprość sekcję given za pomocą wzorca budowniczy.
     * Czy wszystkie właściwości obiektu są niezbędne do działania testu?
     */
    @Test
    public void shouldCalculateOrbitalCircumferenceForMercury() {
        // given
        OrbitalCircumferenceCalculator calculator = new OrbitalCircumferenceCalculator();
        Planet mercury = new Planet("Mercury", RotationDirection.LEFT,
                Distance.createFromMeter(new BigDecimal("4879400")),
                new SiderealYear(new BigDecimal("87.96935")));
        mercury.setAvgOrbitalSpeed(Speed.createKmPerSecond("47.362"));
        mercury.setAcceleration(3.701);
        Set<Gas> gases = new HashSet<>();
        gases.add(Gas.SODIUM);
        gases.add(Gas.OXYGEN);
        gases.add(Gas.HYDROGEN);
        mercury.setAtmosphereGases(gases);

        // when
        Distance result = calculator.calculate(mercury);

        // then
        assertEquals(Distance.createFromKM(new BigDecimal("359977336.24608")), result);
    }

}
