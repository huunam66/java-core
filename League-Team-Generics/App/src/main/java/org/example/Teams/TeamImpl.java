package org.example.Teams;

import java.util.ArrayList;
import java.util.List;

public abstract class TeamImpl<T> implements Team<T> {

    private String name;
    private List<T> teams;

    public TeamImpl(String name) {
        this.teams = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void printTeam() {
        System.out.println();
        System.out.printf("\n\n%15s %s", "\u2022", name);
    }

    @Override
    public void addPlayer(T player) {
        teams.add(player);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getTeams() {
        return teams;
    }

    public void setTeams(List<T> teams) {
        this.teams = teams;
    }
}
