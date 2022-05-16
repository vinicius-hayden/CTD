import entities.Person;
import entities.Pet;

public class Program {

    public static void main(String[] args) {

        Person p1 = new Person("Ana", new Pet("Fila"));
        System.out.println(p1);

        Person p2 = new Person("Luiza", new Pet("Poodle"));
        System.out.println(p2);

    }

}
