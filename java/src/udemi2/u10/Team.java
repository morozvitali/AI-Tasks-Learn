package udemi2.u10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Partisipant> {

    private String name;
    private List <T> list = new ArrayList<>();

    public Team (String name) {
        this.name = name;
    }

    public void addNewPartisipant (T partisipant) {
        list.add(partisipant);
        System.out.println("Into the team name " + this.name + " added new partisipant " + partisipant.getName());
    }

    public void playWith (Team team) {
        String nameWinner;
        Random random = new Random();
        int i = random.nextInt(2);

        if (i==0) {
            nameWinner = this.name;
        } else {
            nameWinner = team.name;
        }
        System.out.println("winner is " + nameWinner);

    }
}
