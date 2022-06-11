import entities.Player;
import entities.Team;

public class Program {

    public static void main(String[] args) {

        Player player1 = new Player(1,13,"Alisson (Liverpool)", true, true);
        Player player2 = new Player(2,2,"Thiago Silva (Chelsea)", true, true);
        Player player3 = new Player(3,17,"Daniel Alves (Barcelona)", false, true);
        Player player4 = new Player(4,15,"Fred (Manchester United)", false, true);
        Player player5 = new Player(5,11,"Gabriel Jesus (Manchester City)", false, true);

        Team dreamTeam = new Team(1, "Brazil");

        dreamTeam.addPlayer(player1);
        dreamTeam.addPlayer(player2);
        dreamTeam.addPlayer(player3);
        dreamTeam.addPlayer(player4);
        dreamTeam.addPlayer(player5);

        System.out.println(" ");
        System.out.println("Titular Players");
        dreamTeam.showTitularPlayer();

        System.out.println(" ");
        System.out.println("Hurt Players");
        System.out.println(dreamTeam.howManyHurtPlayers());

    }

}
