package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.Arrays;
import java.util.List;

public class PlanetGasMatcher extends BaseMatcher<Planet>{


    private List<Gas> gases;

    private PlanetGasMatcher(List<Gas> gases) {
        this.gases = gases;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getAtmosphereGases().containsAll(gases);
    }

    @Override
    public void describeTo(Description description) {

    }

    public static PlanetGasMatcher hasGas(Gas gas) {
        return new PlanetGasMatcher(Arrays.asList(gas));
    }

    public static PlanetGasMatcher hasGases(Gas... gas) {
        return new PlanetGasMatcher(Arrays.asList(gas));
    }
}
