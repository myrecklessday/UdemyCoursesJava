package section_10_generics.generics_challenge;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

import section_10_generics.our_generic_class.BaseballPlayer;

public class Main {

    public static void main(String[] args) {

        //ArrayList<team> teams;
        //Collection.sort(teams);

        League<Team<FootballPlayer>> footballLeague = new League<>("La League");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");


        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

//        footballLeague.addTeam(baseballTeam);
        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.addTeam(rawTeam);     // unchecked warning

//        League<Player, Team<FootballPlayer>> rawLeague = new League<>("Raw");
        League<Team> rawLeague = new League<>("Raw");
        rawLeague.addTeam(adelaideCrows);     // no warning
        rawLeague.addTeam(baseballTeam);    // no warning
        rawLeague.addTeam(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.addTeam(adelaideCrows);     // unchecked warning
        reallyRaw.addTeam(baseballTeam);    // unchecked warning
        reallyRaw.addTeam(rawTeam);         // unchecked warning


    }

}
