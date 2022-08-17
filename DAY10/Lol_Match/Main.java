import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero>team1 = new ArrayList<>();

        List<Hero>team2 = new ArrayList<>();
        

        // Team 1
        Hero hero1Team1 = new Hero("A", "carry");
        Hero hero2Ofteam1 = new Hero("B", "support");
        Hero hero3Ofteam1 = new Hero("C", "tanker");
        Hero hero4Ofteam1 = new Hero("D", "top");
        Hero hero5Ofteam1 = new Hero("E", "bot");
        team1.add(0, hero1Team1);
        team1.add(1, hero2Ofteam1);
        team1.add(2, hero3Ofteam1);
        team1.add(3, hero4Ofteam1);
        team1.add(4, hero5Ofteam1);
        System.out.println("Team 1: ");
        System.out.println(team1.toString());

        //Team 2
        Hero hero1Ofteam2 = new Hero("A2", "carry");
        Hero hero2Ofteam2 = new Hero("B2", "support");
        Hero hero3Ofteam2 = new Hero("C2", "tanker");
        Hero hero4Ofteam2 = new Hero("D2", "bot");
        Hero hero5Ofteam2 = new Hero("E2", "top");

        team2.add(0, hero1Ofteam2);
        team2.add(1, hero2Ofteam2);
        team2.add(2, hero3Ofteam2);
        team2.add(3, hero4Ofteam2);
        team2.add(4, hero5Ofteam2);
        System.out.println("Team 2: ");
        System.out.println(team2.toString());
    }
}