package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.Arrays;
import java.util.List;

public class PlanetGasHasOnlyMatcher extends BaseMatcher<Planet>{

    private List<Gas> gases;

    private PlanetGasHasOnlyMatcher(List<Gas> gases) {
        this.gases = gases;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getAtmosphereGases().containsAll(gases) && gases.size() == p.getAtmosphereGases().size();
    }

    @Override
    public void describeTo(Description description) {
    }

    public static PlanetGasHasOnlyMatcher hasOnlyGases(Gas... gases) {
        return new PlanetGasHasOnlyMatcher(Arrays.asList(gases));
    }
}
