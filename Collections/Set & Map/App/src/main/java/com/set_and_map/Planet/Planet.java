package com.set_and_map.Planet;

import java.util.HashSet;
import java.util.Set;

public class Planet {
    private Planet.Key key;
    private double location;
    private Set<Planet> satellites = new HashSet<>();


    public Planet(Planet.Key key) {
        this(0, key, null);
    }

    public Planet(double location, Planet.Key key) {
        this(location, key, null);
    }

    public Planet(double location, Planet.Key key, Set<Planet> satellites) {
        this.key = key;
        this.location = location;
        if (satellites != null) this.satellites = satellites;
    }

    public void printSatellites(int space) {
        System.out.println(String.format("%" + space + "s %s: %.2f", "\u2022 ", key.getName(), location));
        if (this.satellites.isEmpty()) return;

        for (Planet planet : this.satellites) {
            planet.printSatellites(space + space / 2);
        }
    }

    private Planet findSatellite(Planet.Key key) {
        for (Planet satellite : this.satellites) {
            if (satellite.equals(new Planet(key))) return satellite;
        }
        return null;
    }

    public boolean addSatellite(Planet planet) {
        return this.satellites.add(planet);
    }

    @Override
    public String toString() {
        return "Planet{" + "key=" + key + ", location=" + location + ", satellites=" + satellites + '}';
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public Key getKey() {
        return key;
    }

    public Set<Planet> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public void setSatellites(Set<Planet> satellites) {
        this.satellites = satellites;
    }

    @Override
    public int hashCode() {
//        System.out.println(this.getKey().hashCode());
        return this.getKey().hashCode();
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

//        if (obj == null || obj.getClass() != this.getClass()) return false;
        if (obj == null || (this.getClass() != obj.getClass())) return false;

//        System.out.println("this.getClass(): " + this.getClass());
//        System.out.println("obj.getClass(): " + obj.getClass());
//
//        System.out.println(this);
//        System.out.println(obj);

        Planet.Key keyObj = ((Planet) obj).getKey();
        return this.getKey().equals(keyObj);
    }


    public static Planet.Key makeKey(String name, PlanetTypes type) {
        return new Planet.Key(name, type);
    }

    public static final class Key {
        private final String name;
        private final PlanetTypes type;

        public Key(String name, PlanetTypes type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || (this.getClass() != obj.getClass())) return false;

            String name = ((Planet.Key) obj).getName();
            PlanetTypes type = ((Planet.Key) obj).getType();

            return this.name.equalsIgnoreCase(name) && this.type == type;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.type.hashCode();
        }


        public String getName() {
            return name;
        }

        public PlanetTypes getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Key{" + "name='" + name + '\'' + ", type=" + type + '}';
        }
    }
}
