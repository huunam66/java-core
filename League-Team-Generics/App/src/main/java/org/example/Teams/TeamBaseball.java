package org.example.Teams;

import org.example.Players.Player;

public class TeamBaseball<T extends Player> extends TeamImpl<T> {

    private final int numPlayer = 9;

    public TeamBaseball(String name) {
        super(name);
    }

    @Override
    public void printTeam() {
        super.printTeam();
        for (T p : super.getTeams()) {
            p.printPlayer();
        }
    }
}