package com.set_and_map.Planet;

public interface SolarSystem {

    public boolean addSolarSystem(Planet planet);

    Planet findPlanet(Planet.Key key);

    void printSolarSystem();
}
