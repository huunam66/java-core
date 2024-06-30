package org.example.Leagues;


import org.example.Teams.Team;

public class LeagueFootball<T extends Team> extends LeagueImpl<T> {

    public LeagueFootball(String name) {
        super(name);
    }

    @Override
    public void printLeague() {
        super.printLeague();
        for (T t : super.getTeams()) {
            t.printTeam();
        }
    }

}
