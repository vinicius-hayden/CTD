import java.util.Scanner;

public class Main {

    public static int howManyQtd(float qt) {

        Scanner input = new Scanner(System.in);
        float kg = 0.0f;
        int pack = 0;

        while(kg < qt) {

            System.out.print("Type the weight of the pack: ");
            float weight = input.nextFloat();

            kg = kg + weight;
            pack = pack + 1;

        }

        input.close();
        return pack;

    }

    public static void main(String[] args) {

        Scanner gets;
        gets = new Scanner(System.in);

        System.out.print("Type the dog's name: ");
        String name = gets.nextLine();

        System.out.print("Type the quantity of dog food: ");
        float quantity = gets.nextFloat();

        int value = howManyQtd(quantity);
        System.out.printf("Your dog %s needs %d dog food(s)", name, value);

        gets.close();

    }

}
