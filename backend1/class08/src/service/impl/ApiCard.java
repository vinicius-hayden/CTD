package service.impl;

import entities.Card;

public class ApiCard {

    public int discount(Card card) {
        if (card.getBank().compareTo("Star Bank") == 0) {
            return 20;
        } else {
            return 0;
        }
    }
}
