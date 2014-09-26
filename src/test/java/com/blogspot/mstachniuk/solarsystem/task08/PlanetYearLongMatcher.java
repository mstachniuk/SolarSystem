package com.blogspot.mstachniuk.solarsystem.task08;

import com.blogspot.mstachniuk.solarsystem.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.math.BigDecimal;

public class PlanetYearLongMatcher extends BaseMatcher<Planet>{

    private String yearLongInEarthDays;

    private PlanetYearLongMatcher(String yearLongInEarthDays) {
        this.yearLongInEarthDays = yearLongInEarthDays;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getSiderealYear().inEarthDays().compareTo(new BigDecimal(yearLongInEarthDays)) == 0;
    }

    @Override
    public void describeTo(Description description) {
    }

    public static PlanetYearLongMatcher yearLongInEarthDays(String yearLongInEarthDays) {
        return new PlanetYearLongMatcher(yearLongInEarthDays);
    }
}
