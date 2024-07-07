package com.set_and_map.Planet;

import java.util.Set;

public class SolarSystemInstance extends SolarSystemImpl {

    @Override
    public boolean addSolarSystem(Planet planet) {
        return super.addSolarSystem(planet);
    }

    @Override
    public Planet findPlanet(Planet.Key key) {
        return super.findPlanet(key);
    }

    @Override
    public void printSolarSystem() {
        Set<Planet> planetSet = super.getPlanets();
        for (Planet planet : super.getSolarSystem().values()) {
            planet.printSatellites(15);
        }
    }
}
