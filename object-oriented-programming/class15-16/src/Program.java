import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner gets = new Scanner(System.in);
        int num1, num2, division;

        try {
            System.out.print("Type the first number: ");
            num1 = gets.nextInt();
            System.out.print("Type the second number: ");
            num2 = gets.nextInt();

            division = num1/num2;
            System.out.println("Division result = " + division);

        }
        catch (InputMismatchException e) {
            System.err.println("Input error, please try again");
        }
        catch (ArithmeticException e) {
            System.err.println("Input error, the divisor cannot be 0.");
        }
        finally {
            System.out.println("Try catch process is done!");
            gets.close();
        }

    }

}
