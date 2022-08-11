import entities.Tree;
import factory.TreeFactory;

public class Program {

    public static void main(String[] args) {

        TreeFactory factory = new TreeFactory();

        for (int i = 0; i <= 500000; i++) {
            Tree ornamental = factory.getTree(200,400, "Green");
            Tree fruitful = factory.getTree(500,300, "red");
            System.out.println("Ornamental tree: " + ornamental);
            System.out.println("Fruitful tree: " + fruitful);
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println(
                "Memory Utilized: " + (runtime.totalMemory() -
                runtime.freeMemory()) / (1024 * 1024)
        );
    }
}
