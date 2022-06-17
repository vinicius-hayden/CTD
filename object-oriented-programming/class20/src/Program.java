import entities.Storage;

public class Program {

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addProduct("BOLATENIS");
        storage.addProduct("CAIXA10x10");
        storage.addProduct("FUTEBOL");

        System.out.println("Hello!");
        storage.printProducts();
        System.out.println(storage.calculateMinimumSpace());

    }

}
