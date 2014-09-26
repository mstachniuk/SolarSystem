package com.blogspot.mstachniuk.solarsystem.task01;

import com.blogspot.mstachniuk.solarsystem.*;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import org.junit.Test;

import java.math.BigDecimal;

import static com.blogspot.mstachniuk.solarsystem.task01.PlanetBuilder.aPlanet;
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

        Planet mercury = aPlanet()
                .avgOrbitalSpeedInKmPerSecond("47.362")
                .siderealYearInEarthDays("87.96935")
                .build();

        // when
        Distance result = calculator.calculate(mercury);

        // then
        assertEquals(Distance.createFromKM(new BigDecimal("359977336.24608")), result);
    }

}
