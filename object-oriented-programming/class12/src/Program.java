import entities.Dog;
import entities.Horse;
import entities.Sloth;

public class Program {

    public static void main(String[] args) {

        Dog d1 = new Dog(1, "Bob", 5);
        System.out.println(d1);
        d1.generateSound();
        d1.run();

        Horse h1 = new Horse(2, "Juan", 10);
        System.out.println(h1);
        h1.generateSound();
        h1.run();

        Sloth s1 = new Sloth(3, "George", 5);
        System.out.println(s1);
        s1.generateSound();
        s1.climbATree();

    }

}
