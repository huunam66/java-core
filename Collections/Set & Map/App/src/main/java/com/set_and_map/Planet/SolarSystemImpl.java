package com.set_and_map.Planet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class SolarSystemImpl implements SolarSystem {

    private Set<Planet> planets = new HashSet<>();
    private Map<Planet.Key, Planet> solarSystem = new HashMap<>();

    @Override
    public Planet findPlanet(Planet.Key key) {
        return this.solarSystem.get(key);
    }

    @Override
    public abstract void printSolarSystem();


    @Override
    public boolean addSolarSystem(Planet planet) {
        if (planet == null) return false;

//        System.out.println(this.solarSystem.put(planet.getKey(), planet));

        this.solarSystem.put(planet.getKey(), planet);
        this.addPlanet(planet);

        if (!planet.getSatellites().isEmpty()) {
            for (Planet satellite : planet.getSatellites()) {
                addSolarSystem(satellite);
            }
        }

        return true;
    }

    private boolean addPlanet(Planet planet) {
        return this.planets.add(planet);
    }

    protected Set<Planet> getPlanets() {
        return new HashSet<>(this.planets);
    }

    protected void setPlanets(Set<Planet> planets) {
        this.planets = planets;
    }

    protected Map<Planet.Key, Planet> getSolarSystem() {
        return new HashMap<>(this.solarSystem);
    }

    protected void setSolarSystem(Map<Planet.Key, Planet> solarSystem) {
        this.solarSystem = solarSystem;
    }
}
