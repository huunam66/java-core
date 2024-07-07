package com.set_and_map.Planet;

public class Jupiter extends Planet {

    public Jupiter(String name, double location) {
        super(location, Planet.makeKey(name, PlanetTypes.JUPITER));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (obj instanceof Jupiter) {
            Planet jupiterObj = ((Jupiter) obj);
            return super.equals(jupiterObj);
        }

        return false;
    }
}
