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
        if (description.equals("CAIXA10x10")) {
            return new Box(10,10,10);
        } else if (description.equals("FUTEBOL")) {
            return new Ball(11);
        } else if (description.equals("BOLATENIS")) {
            return new Ball(0.32);
        } else {
            return null;
        }
    }

}
