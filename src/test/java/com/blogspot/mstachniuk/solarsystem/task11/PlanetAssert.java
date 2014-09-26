package com.blogspot.mstachniuk.solarsystem.task11;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class PlanetAssert extends AbstractAssert<PlanetAssert, Planet> {

    protected PlanetAssert(Planet actual) {
        super(actual, PlanetAssert.class);
    }

    public static PlanetAssert assertThat(Planet actual) {
        Assertions.assertThat(actual)
                .isNotNull();
        return new PlanetAssert(actual);
    }

    public PlanetAssert hasRotation(RotationDirection rotationDirection) {
        Assertions.assertThat(actual.getRotationDirection())
                .isEqualTo(rotationDirection);
        return this;
    }

    public PlanetAssert hasDiameterInMeter(String diameterInMeter) {
        Assertions.assertThat(actual.getDiameter().getMeter())
                .isEqualByComparingTo(diameterInMeter);
        return this;
    }

    public PlanetAssert hasYearInEarthDays(String yearInEarthDays) {
        Assertions.assertThat(actual.getSiderealYear().inEarthDays())
                .isEqualByComparingTo(yearInEarthDays);
        return this;
    }

    public PlanetAssert hasAvgOrbitalSpeedInKmPerSecond(String speedInKmPerSecond) {
        Assertions.assertThat(actual.getAvgOrbitalSpeed().getKmPerSecond())
                .isEqualByComparingTo(speedInKmPerSecond);
        return this;
    }

    public PlanetAssert hasAcceleration(double acceleration) {
        Assertions.assertThat(actual.getAcceleration())
                .isEqualTo(acceleration);
        return this;
    }

    public PlanetAssert containsGas(Gas gas) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .contains(gas);
        return this;
    }

    public PlanetAssert containsOnlyGases(Gas... gases) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .containsOnly(gases);
        return this;
    }

    public PlanetAssert containsGases(Gas... gases) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .contains(gases);
        return this;
    }

    public PlanetAssert doesNotContainGases(Gas... gas) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .doesNotContain(gas);
        return this;
    }
}
