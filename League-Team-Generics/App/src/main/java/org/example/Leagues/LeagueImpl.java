package org.example.Leagues;


import org.example.Teams.Team;

import java.util.ArrayList;
import java.util.List;

public abstract class LeagueImpl<T extends Team> implements League<T> {
    private String name;

    private List<T> teams;

    public LeagueImpl(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    @Override
    public void printLeague() {
        System.out.printf("\n\n %10s %s", "\u2022", name);
    }

    @Override
    public void addTeam(T team) {
        this.teams.add(team);
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
