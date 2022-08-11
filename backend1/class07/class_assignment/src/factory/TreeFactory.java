package factory;

import entities.Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static Map<String, Tree> flyweight = new HashMap<>();

    public Tree getTree(int height, int width, String color) {
        String tree = "Height: " + height + " - width: " + width + " - Color" + color;

        System.out.println(tree);

        if (!flyweight.containsKey(tree)) {
            flyweight.put(tree, new Tree(height,width,color));
            System.out.println("New Tree!");
            return flyweight.get(tree);
        } else {
            System.out.println("Tree already planted");
            return flyweight.get(tree);
        }

    }

}
