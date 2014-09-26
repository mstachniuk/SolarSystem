package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Planet;
import com.blogspot.mstachniuk.solarsystem.RotationDirection;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class PlanetRotationDirectionMatcher extends BaseMatcher<Planet> {

    private RotationDirection rotation;

    private PlanetRotationDirectionMatcher(RotationDirection rotation) {
        this.rotation = rotation;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getRotationDirection() == rotation;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("not rotation: " + rotation);
    }

    @Factory
    public static PlanetRotationDirectionMatcher rotation(RotationDirection rotation) {
        return new PlanetRotationDirectionMatcher(rotation);
    }
}
