import entities.Player;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Player p1 = new Player();
        Scanner gets = new Scanner(System.in);

        System.out.print("Escreva o seu nome: ");
        String nomedigitado = gets.nextLine();
        p1.setNome(nomedigitado);

        System.out.print("Escreva o seu nickname: ");
        String nicknamedigitado = gets.nextLine();
        p1.setNickname(nicknamedigitado);


        p1.aumentarPontuacao(15);
        System.out.println(p1);

        p1.subirNivel(1);
        System.out.println(p1);

        p1.bonus(15);
        System.out.println(p1);

    }
}
