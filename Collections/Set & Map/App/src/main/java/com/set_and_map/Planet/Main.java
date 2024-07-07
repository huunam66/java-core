package com.set_and_map.Planet;


public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystemInstance();

//        Planet jupiter = new Jupiter(1223, "jupi1ter");
//        solarSystem.addSolarSystem(jupiter);
//        jupiter = new Jupiter(123, "jupi1ter");
//
//        solarSystem.addSolarSystem(jupiter);
//
//        Planet moon = new Moon(123, "moon");
//        solarSystem.addSolarSystem(moon);
//        Planet earth = new Earth(123, "earth");
//        solarSystem.addSolarSystem(earth);
//        solarSystem.printSolarSystem();

        Planet planet1 = new Earth("Earth 1", 425.2);
        for (int i = 2; i < 10; i++) {
            Planet planet2 = new Jupiter("Jupiter " + i, i * 22);
            if (i > 3 && i < 6) {
                int d = 0;
                for (int j = i * 10; d < 10; j++) {
                    Planet planet3 = new Moon("Moon " + j, j * 22);
                    if (d == 3) {
                        for (int h = 4; h < 10; h++) {
                            planet3.addSatellite(new Jupiter("Jupiter " + (h * 12 + 3), h * 13 + 2));
                        }
                    }
                    planet2.addSatellite(planet3);
                    d++;
                }
            }
            planet1.addSatellite(planet2);
        }
        solarSystem.addSolarSystem(planet1);

        Planet p = new Earth("Earth 1", 425.32);
        solarSystem.addSolarSystem(p);

        solarSystem.printSolarSystem();
    }
}