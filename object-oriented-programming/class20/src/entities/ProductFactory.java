package entities;

public class ProductFactory {

    private static ProductFactory instance;

    private ProductFactory(){
    }

    public static ProductFactory getInstance() {
        if (instance == null) {
            instance = new ProductFactory();
        }
        return instance;
    }

    public static Product createProduct(String description) {
        return switch (description) {
            case "CAIXA10x10" -> new Box(10, 10, 10);
            case "FUTEBOL" -> new Ball(11);
            case "BOLATENIS" -> new Ball(0.32);
            default -> null;
        };
    }

}
