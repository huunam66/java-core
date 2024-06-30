package org.example.Sports;

import org.example.Leagues.League;

public class SportInstance<T extends League> extends SportImpl<T> {

    public SportInstance(String name) {
        super(name);
    }

    @Override
    public void printSport() {
        super.printSport();
        for (T l : super.getLeagues()) {
            l.printLeague();
        }
    }

    @Override
    public void addLeague(T league) {
        super.getLeagues().add(league);
    }
}
