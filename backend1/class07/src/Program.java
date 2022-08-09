import entities.Computer;
import factory.ComputerFactory;

public class Program {

    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();
        Computer mac1 = factory.getComputer(1,16,500);
        Computer mac2 = factory.getComputer(2, 16, 200);
        Computer mac3 = factory.getComputer(3,32,1000);

        Computer win1 = factory.getComputer(4,64,1000);
        Computer win2 = factory.getComputer(5,64,1000);

        System.out.println("MAC1: " + mac1);
        System.out.println("MAC2: " + mac2);
        System.out.println("MAC3: " + mac3);

        System.out.println("Windows 1: " + win1);
        System.out.println("Windows 2: " + win2);

    }

}
