package org.example.Leagues;

import org.example.Teams.Team;

public class LeagueAmerican_Football<T extends Team> extends LeagueImpl<T> {

    public LeagueAmerican_Football(String name) {
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
