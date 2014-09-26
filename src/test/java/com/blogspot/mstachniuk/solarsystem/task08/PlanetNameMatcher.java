package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class PlanetNameMatcher extends BaseMatcher<Planet> {

    private String name;

    private PlanetNameMatcher(String name) {
        this.name = name;
    }

    @Override
    public boolean matches(Object o) {
        Planet p = (Planet) o;
        return p.getName().equals(name);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("not Planet with name: " + name);
    }

    @Factory
    public static PlanetNameMatcher name(String name) {
        return new PlanetNameMatcher(name);
    }

}
