package f_generics;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.addToLeague(adelaideCrows);
        footballLeague.addToLeague(melbourne);
        footballLeague.addToLeague(hawthorn);
        footballLeague.addToLeague(fremantle);

//        footballLeague.addToLeague(baseballTeam);
        footballLeague.printList();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.addToLeague(rawTeam);     // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.addToLeague(adelaideCrows);     // no warning
        rawLeague.addToLeague(baseballTeam);    // no warning
        rawLeague.addToLeague(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.addToLeague(adelaideCrows);     // unchecked warning
        reallyRaw.addToLeague(baseballTeam);    // unchecked warning
        reallyRaw.addToLeague(rawTeam);         // unchecked warning

    }
}