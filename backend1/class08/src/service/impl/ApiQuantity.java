package service.impl;

public class ApiQuantity {

    public int discount(int quantity) {

        if (quantity > 12) {
            return 15;
        } else {
            return 0;
        }

    }

}
