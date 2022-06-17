package entities;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<Product> productList;

    public Storage() {
        productList = new ArrayList<>();
    }

    public void addProduct(String product){
        productList.add(ProductFactory.createProduct(product));
    }

    public void printProducts() {
        for (Product product: productList) {
            System.out.println(product.calculateSpace());
        }
    }

    public double calculateMinimumSpace() {
        double totalAreaRequired = 0;
        for (Product product: productList) {
            totalAreaRequired += product.calculateSpace();
        }
        return totalAreaRequired;
    }

}
