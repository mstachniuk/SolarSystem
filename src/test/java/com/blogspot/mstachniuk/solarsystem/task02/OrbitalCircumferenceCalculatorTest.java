package com.blogspot.mstachniuk.solarsystem.task02;

import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.SiderealYear;
import com.blogspot.mstachniuk.solarsystem.task01.OrbitalCircumferenceCalculator;
import com.blogspot.mstachniuk.solarsystem.vo.Distance;
import com.blogspot.mstachniuk.solarsystem.vo.Speed;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OrbitalCircumferenceCalculatorTest {

    /**
     * Task 02: Tworzenie przykladowej planety na potrzeby testu jest trochę trudne.
     * Uprość sekcję given za pomocą wzorca budowniczy z Projektu Lombok.
     * Czy wszystkie właściwości obiektu są niezbędne do działania testu?
     */
    @Test
    public void shouldCalculateOrbitalCircumferenceForMercury() {
        // given
        OrbitalCircumferenceCalculator calculator = new OrbitalCircumferenceCalculator();
        Planet mercury = Planet.builder()
                .avgOrbitalSpeed(Speed.createKmPerSecond("47.362"))
                .siderealYear(new SiderealYear(new BigDecimal("87.96935")))
                .build();

        // when
        Distance result = calculator.calculate(mercury);

        // then
        assertEquals(Distance.createFromKM(new BigDecimal("359977336.24608")), result);
    }

}
