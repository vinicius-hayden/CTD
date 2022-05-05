import java.util.Scanner;

public class Challenge {

    private static boolean isPrime(int number) {

        if (number == 1) {

            return true;

        }

        int qtyDivisors = 0;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                qtyDivisors++;

            }

        }

        if (qtyDivisors > 0) {

            return false;
        } else {

            return true;

        }
    }

    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        try {
            System.out.print("Type a number: ");

            int n = gets.nextInt();

            for (int i = 1; i <= n; i++) {

                if (isPrime(i)) {
                    System.out.println(i);
                }

            }
        } finally {
            gets.close();
        }
    }

}