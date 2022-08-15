package service.impl;

import entities.Card;
import entities.Product;

public class ApiProduct {

    public int discount(Product product) {
        if (product.getType().compareTo("Can") == 0) {
            return 10;
        } else {
            return 0;
        }
    }
}
