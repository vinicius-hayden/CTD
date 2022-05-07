import java.util.Scanner;

public class Main {

    private static void whichWin (int num1, int num2) {

        if(num1 == num2) {
            System.out.println("Draw");
        }
        else if (num1 == 1 && num2 == 2) {
            System.out.println("Rock with Scissors, the first player won");
        }
        else if (num1 == 2 && num2 == 1) {
            System.out.println("Scissors with Rock, the second player won");
        }
        else if (num1 == 1 && num2 == 3) {
            System.out.println("Rock with paper, the second player won");
        }
        else if (num1 == 3 && num2 == 1) {
            System.out.println("Paper with Rock, the first player won");
        }
        else if (num1 == 2 && num2 == 3) {
            System.out.println("Scissors with Paper, the first player won");
        }
        else if (num1 == 3 && num2 == 2) {
            System.out.println("Paper with Scissors, the second player won");
        }

    }

    public static void main(String[] args) {

        Scanner gets = new Scanner(System.in);

        String firstPlayer;
        int firstPlayerOption;
        String secondPlayer;
        int secondPlayerOption;

        System.out.println("----First Player info----");

        System.out.print("Type your name: ");
        firstPlayer = gets.nextLine();

        System.out.print("Type your option - 1 - Rock, 2 - Scissors, 3 - Paper: ");
        firstPlayerOption = gets.nextInt();

        if (firstPlayerOption == 1 || firstPlayerOption == 2 || firstPlayerOption == 3) {

            System.out.println("----Second Player info----");

            System.out.print("Type your name: ");
            secondPlayer = gets.nextLine();

            System.out.print("Type your option - 1 - Rock, 2 - Scissors, 3 - Paper: ");
            secondPlayerOption = gets.nextInt();

            if (secondPlayerOption == 1 || secondPlayerOption == 2 || secondPlayerOption == 3) {
                whichWin(firstPlayerOption, secondPlayerOption);
            }
            else {
                System.out.println("Please, type a valid output value (1, 2 or 3)");
            }

        }
        else {
            System.out.println("Please, type a valid output value (1, 2 or 3)");
        }


    }

}
