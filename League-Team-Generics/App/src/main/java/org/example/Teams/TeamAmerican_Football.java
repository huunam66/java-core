package org.example.Teams;

import org.example.Players.Player;

public class TeamAmerican_Football<T extends Player> extends TeamImpl<T> {

    private final int numPlayer = 11;

    public TeamAmerican_Football(String name) {
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