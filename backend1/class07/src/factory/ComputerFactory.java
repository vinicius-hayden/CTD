package factory;

import entities.Computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static Map<String, Computer> flyweight = new HashMap<>();

    public Computer getComputer(int id, int ram, int hd) {
        String comp = "RAM: " + ram + "- HD: " + hd;
        System.out.println(comp);

        if (!flyweight.containsKey(comp)) {
            flyweight.put(comp, new Computer(id, ram, hd));
            System.out.println("New pc instance!");
            return flyweight.get(comp);
        } else {
            System.out.println("PC obtained from memory.");
            return flyweight.get(comp);
        }
    }
}
