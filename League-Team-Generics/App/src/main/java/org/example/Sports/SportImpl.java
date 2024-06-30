package org.example.Sports;


import org.example.Leagues.League;

import java.util.ArrayList;
import java.util.List;

public abstract class SportImpl<T extends League> implements Sport<T> {

    private String name;
    private List<T> Leagues;


    public SportImpl(String name) {
        this.Leagues = new ArrayList<>();
        this.name = name;
    }

    @Override
    public abstract void addLeague(T league);

    @Override
    public void printSport() {
        System.out.printf("\n\n%5s %s", "\u2022", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getLeagues() {
        return Leagues;
    }

    public void setLeagues(List<T> leagues) {
        Leagues = leagues;
    }
}
