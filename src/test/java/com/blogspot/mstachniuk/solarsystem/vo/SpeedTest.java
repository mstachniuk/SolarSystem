package com.blogspot.mstachniuk.solarsystem.vo;

import org.junit.Test;

import java.math.BigDecimal;

import static com.blogspot.mstachniuk.solarsystem.vo.Speed.createKmPerSecond;
import static org.junit.Assert.*;

public class SpeedTest {

    @Test
    public void shouldConvert5KmPerSecondTo5000MeterPerSecond() {
        // given
        Speed speed = createKmPerSecond("5");

        // when
        BigDecimal meterPerSecond = speed.getMeterPerSecond();

        // then
        assertEquals(new BigDecimal("5000"), meterPerSecond);
    }

    @Test
    public void shouldConvert55KmPerSecondTo55000MeterPerSecond() {
        assertEquals(new BigDecimal("55000"), createKmPerSecond("55").getMeterPerSecond());
    }

    @Test
    public void shouldConvertXKmPerSecondToYMeterPerSecond() {
        assertEquals(new BigDecimal("55000"), createKmPerSecond("55").getMeterPerSecond());
    }

    @Test
    public void shouldConvertMeterPerSecondToKmPerSecond() {
        // given
        Speed speed = Speed.createMeterPerSecond("123456.7");

        // when
        BigDecimal kmPerSecond = speed.getKmPerSecond();

        // then
        assertEquals(new BigDecimal("123.4567"), kmPerSecond);
    }
}