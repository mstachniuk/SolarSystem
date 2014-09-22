package com.blogspot.mstachniuk.solarsystem.vo;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DistanceTest {

    @Test
    public void shouldCreateDistanceFromMeter() {
        // given

        // when
        Distance distance = Distance.createFromMeter(new BigDecimal("5000"));

        // then
        assertEquals(0, new BigDecimal(5).compareTo(distance.getKm()));
    }
}