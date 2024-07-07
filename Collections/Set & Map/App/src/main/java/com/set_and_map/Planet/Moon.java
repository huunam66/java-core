package com.set_and_map.Planet;

public class Moon extends Planet {

    public Moon(String name, double location) {
        super(location, Planet.makeKey(name, PlanetTypes.MOON));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (obj instanceof Moon) {
            Planet moonObj = ((Moon) obj);
            return super.equals(moonObj);
        }

        return false;
    }
}
