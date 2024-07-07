package com.set_and_map.Planet;

public class Earth extends Planet {

    public Earth(String name, double location) {
        super(location, Planet.makeKey(name, PlanetTypes.EARTH));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (obj instanceof Earth) {
            Planet earthObj = ((Earth) obj);
            return super.equals(earthObj);
        }

        return false;
    }
}
