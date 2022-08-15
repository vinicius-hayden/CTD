package service;

import entities.Card;
import entities.Product;

public interface IFacadeDiscount {

    int discount(Card card, Product product, int quantity);

}
