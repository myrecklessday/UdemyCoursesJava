package section_10_generics.generics_challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League</*U extends Player,*/ T extends Team> {

    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already in the league");
            return false;
        } else {
            league.add(team);
            System.out.println("Team " + team.getName() + " was added to the " + this.getName() + " league");
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T team : league) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
