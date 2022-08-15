package service.impl;

import entities.Card;
import entities.Product;
import service.IFacadeDiscount;

public class FacadeDiscount implements IFacadeDiscount {

    private ApiCard apiCard;
    private ApiProduct apiProduct;
    private ApiQuantity apiQuantity;

    public FacadeDiscount(){
        apiCard = new ApiCard();
        apiProduct = new ApiProduct();
        apiQuantity = new ApiQuantity();
    }

    @Override
    public int discount(Card card, Product product, int quantity) {
        int discount = 0;
        discount += apiProduct.discount(product);
        discount += apiCard.discount(card);
        discount += apiQuantity.discount(quantity);
        return discount;
    }
}
