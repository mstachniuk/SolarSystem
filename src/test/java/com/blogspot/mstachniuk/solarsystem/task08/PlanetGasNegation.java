package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Gas;
import com.blogspot.mstachniuk.solarsystem.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.Arrays;
import java.util.List;

public class PlanetGasNegation extends BaseMatcher<Planet>{

    private List<Gas> gases;
    private Gas incorrectGas;

    private PlanetGasNegation(List<Gas> gases) {
        this.gases = gases;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        for (Gas gas : gases) {
            if(p.getAtmosphereGases().contains(gas)) {
                incorrectGas = gas;
                return false;
            }
        }
        return true;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("incorrect gas: " + incorrectGas);
    }

    public static PlanetGasNegation hasNotGases(Gas... gases) {
        return new PlanetGasNegation(Arrays.asList(gases));
    }
}
