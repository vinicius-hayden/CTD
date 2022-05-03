import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1, num2;
        float num3, num4;
        Scanner gets;
        gets = new Scanner(System.in);

        System.out.print("Type the value of num1: ");
        num1 = gets.nextInt();
        System.out.print("Type the value of num2: ");
        num2 = gets.nextInt();

        System.out.print("Type the value of num3: ");
        num3 = gets.nextFloat();
        System.out.print("Type the value of num4: ");
        num4 = gets.nextFloat();

        System.out.println("Typed num1 value: " + num1);
        System.out.println("Typed num2 value: " + num2);
        System.out.println("Typed num3 value: " + num3);
        System.out.println("Typed num4 value: " + num4);

    }

}
