package f_generics;

import java.util.*;

public class League<T extends Team> {
    private String name;
    List<T> teamsLeague = new ArrayList<>();


    public League(String name) {
        this.name = name;
    }

    public void addToLeague(T team) {
        int index = 0;
        for (Team t : teamsLeague) {
            if (t.ranking() < team.ranking()) {
                teamsLeague.add(index, team);
                return;
            }
            index++;
        }
        teamsLeague.add(team);
    }

    public void printList() {
        for (Team t : teamsLeague) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }


}
