package org.example.Teams;

import org.example.Players.Player;

public class TeamBasketball<T extends Player> extends TeamImpl<T> {

    private final int numPlayer = 5;

    public TeamBasketball(String name) {
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