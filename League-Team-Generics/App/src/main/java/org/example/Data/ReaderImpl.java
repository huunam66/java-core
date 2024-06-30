package org.example.Data;

import org.example.Leagues.*;
import org.example.Players.*;
import org.example.Sports.Sport;
import org.example.Sports.SportInstance;
import org.example.Teams.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class ReaderImpl implements Reader {
    private List<Sport> sports;

    public ReaderImpl(List<Sport> sports) {
        this.sports = sports;
    }


    @Override
    public void print() {
        if (sports == null) return;
        for (Sport sp : sports) {
            if (sp == null) continue;

            sp.printSport();
        }
    }

    @Override
    public void readAndPrint(String filename) {
        readJsonFile(filename);
        print();
    }

    @Override
    public void readJsonFile(String filename) {
        try {
            Path path = Paths.get("src\\main\\java\\org\\example\\data\\" + filename);
            String result = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
//            System.out.println(result);

            JSONObject jsonData = new JSONObject(result);
            importSports(jsonData);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void importSports(JSONObject jsonObject) {
        sports = new ArrayList<>();
        JSONArray data = (JSONArray) jsonObject.get("data");
        for (Object sport : data) {
            String name = ((JSONObject) sport).get("name").toString();
//            System.out.println(name);
            sports.add(instanceSport(sport, name));
        }
    }

    private Sport instanceSport(Object jsonObject, String name) {
        switch (name.toLowerCase()) {
            case "football (soccer)": {
                Sport<LeagueFootball<TeamFootball<PlayerFootball>>> leagueFootballSport = new SportInstance<>(name);
                importFootball(leagueFootballSport, (JSONObject) jsonObject);
                return leagueFootballSport;
            }
            case "basketball": {
                Sport<LeagueBasketball<TeamBasketball<PlayerBasketball>>> leagueBasketballSport = new SportInstance<>(name);
                importBasketball(leagueBasketballSport, (JSONObject) jsonObject);
                return leagueBasketballSport;
            }
            case "baseball": {
                Sport<LeagueBaseball<TeamBaseball<PlayerBaseball>>> leagueBaseballSport = new SportInstance<>(name);
                importBaseball(leagueBaseballSport, (JSONObject) jsonObject);
                return leagueBaseballSport;
            }
            case "american football": {
                Sport<LeagueAmerican_Football<TeamAmerican_Football<PlayerAmerican_Football>>> leagueAmericanFootballSport = new SportInstance<>(name);
                importAmerican_Football(leagueAmericanFootballSport, (JSONObject) jsonObject);
                return leagueAmericanFootballSport;
            }
            case "cricket": {
                Sport<LeagueCricket<TeamCricket<PlayerCricket>>> leagueCricketSport = new SportInstance<>(name);
                importCricket(leagueCricketSport, (JSONObject) jsonObject);
                return leagueCricketSport;
            }
        }
        return null;
    }

    private void importFootball(Sport<LeagueFootball<TeamFootball<PlayerFootball>>> leagueFootballSport, JSONObject jsonObject) {
        JSONArray leagues = ((JSONArray) jsonObject.get("leagues"));
        for (Object l : leagues) {
            String name = ((JSONObject) l).get("name").toString();
            LeagueFootball<TeamFootball<PlayerFootball>> leagueFootball = new LeagueFootball<>(name);
            JSONArray teams = ((JSONArray) ((JSONObject) l).get("teams"));
            for (Object t : teams) {
                name = ((JSONObject) t).get("name").toString();
                TeamFootball<PlayerFootball> teamFootball = new TeamFootball<>(name);
                JSONArray players = ((JSONArray) ((JSONObject) t).get("players"));
                for (Object p : players) {
                    name = ((JSONObject) p).get("name").toString();
                    String positon = ((JSONObject) p).get("position").toString();
                    String number = ((JSONObject) p).get("number").toString();
                    PlayerFootball playerFootball = new PlayerFootball(name, positon, number);
                    teamFootball.addPlayer(playerFootball);
                }
                leagueFootball.addTeam(teamFootball);
            }
            leagueFootballSport.addLeague(leagueFootball);
        }
    }

    private void importBaseball(Sport<LeagueBaseball<TeamBaseball<PlayerBaseball>>> leagueBaseballSport, JSONObject jsonObject) {
        JSONArray leagues = ((JSONArray) jsonObject.get("leagues"));
        for (Object l : leagues) {
            String name = ((JSONObject) l).get("name").toString();
            LeagueBaseball<TeamBaseball<PlayerBaseball>> leagueBaseball = new LeagueBaseball<>(name);
            JSONArray teams = ((JSONArray) ((JSONObject) l).get("teams"));
            for (Object t : teams) {
                name = ((JSONObject) t).get("name").toString();
                TeamBaseball<PlayerBaseball> teamBaseball = new TeamBaseball<>(name);
                JSONArray players = ((JSONArray) ((JSONObject) t).get("players"));
                for (Object p : players) {
                    name = ((JSONObject) p).get("name").toString();
                    String positon = ((JSONObject) p).get("position").toString();
                    String number = ((JSONObject) p).get("number").toString();
                    PlayerBaseball playerBaseball = new PlayerBaseball(name, positon, number);
                    teamBaseball.addPlayer(playerBaseball);
                }
                leagueBaseball.addTeam(teamBaseball);
            }
            leagueBaseballSport.addLeague(leagueBaseball);
        }
    }

    private void importBasketball(Sport<LeagueBasketball<TeamBasketball<PlayerBasketball>>> leagueBasketballSport, JSONObject jsonObject) {
        JSONArray leagues = ((JSONArray) jsonObject.get("leagues"));
        for (Object l : leagues) {
            String name = ((JSONObject) l).get("name").toString();
            LeagueBasketball<TeamBasketball<PlayerBasketball>> leagueBasketball = new LeagueBasketball<>(name);
            JSONArray teams = ((JSONArray) ((JSONObject) l).get("teams"));
            for (Object t : teams) {
                name = ((JSONObject) t).get("name").toString();
                TeamBasketball<PlayerBasketball> teamBasketball = new TeamBasketball<>(name);
                JSONArray players = ((JSONArray) ((JSONObject) t).get("players"));
                for (Object p : players) {
                    name = ((JSONObject) p).get("name").toString();
                    String positon = ((JSONObject) p).get("position").toString();
                    String number = ((JSONObject) p).get("number").toString();
                    PlayerBasketball playerBasketball = new PlayerBasketball(name, positon, number);
                    teamBasketball.addPlayer(playerBasketball);
                }
                leagueBasketball.addTeam(teamBasketball);
            }
            leagueBasketballSport.addLeague(leagueBasketball);
        }
    }

    private void importCricket(Sport<LeagueCricket<TeamCricket<PlayerCricket>>> leagueCricketSport, JSONObject jsonObject) {
        JSONArray leagues = ((JSONArray) jsonObject.get("leagues"));
        for (Object l : leagues) {
            String name = ((JSONObject) l).get("name").toString();
            LeagueCricket<TeamCricket<PlayerCricket>> leagueCricket = new LeagueCricket<>(name);
            JSONArray teams = ((JSONArray) ((JSONObject) l).get("teams"));
            for (Object t : teams) {
                name = ((JSONObject) t).get("name").toString();
                TeamCricket<PlayerCricket> teamCricket = new TeamCricket<>(name);
                JSONArray players = ((JSONArray) ((JSONObject) t).get("players"));
                for (Object p : players) {
                    name = ((JSONObject) p).get("name").toString();
                    String positon = ((JSONObject) p).get("position").toString();
                    String number = ((JSONObject) p).get("number").toString();
                    PlayerCricket playerCricket = new PlayerCricket(name, positon, number);
                    teamCricket.addPlayer(playerCricket);
                }
                leagueCricket.addTeam(teamCricket);
            }
            leagueCricketSport.addLeague(leagueCricket);
        }
    }

    private void importAmerican_Football(Sport<LeagueAmerican_Football<TeamAmerican_Football<PlayerAmerican_Football>>> leagueCricketSport, JSONObject jsonObject) {
        JSONArray leagues = ((JSONArray) jsonObject.get("leagues"));
        for (Object l : leagues) {
            String name = ((JSONObject) l).get("name").toString();
            LeagueAmerican_Football<TeamAmerican_Football<PlayerAmerican_Football>> leagueAmerican_football = new LeagueAmerican_Football<>(name);
            JSONArray teams = ((JSONArray) ((JSONObject) l).get("teams"));
            for (Object t : teams) {
                name = ((JSONObject) t).get("name").toString();
                TeamAmerican_Football<PlayerAmerican_Football> teamAmerican_football = new TeamAmerican_Football<>(name);
                JSONArray players = ((JSONArray) ((JSONObject) t).get("players"));
                for (Object p : players) {
                    name = ((JSONObject) p).get("name").toString();
                    String positon = ((JSONObject) p).get("position").toString();
                    String number = ((JSONObject) p).get("number").toString();
                    PlayerAmerican_Football playerAmerican_football = new PlayerAmerican_Football(name, positon, number);
                    teamAmerican_football.addPlayer(playerAmerican_football);
                }
                leagueAmerican_football.addTeam(teamAmerican_football);
            }
            leagueCricketSport.addLeague(leagueAmerican_football);
        }
    }


    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }
}
