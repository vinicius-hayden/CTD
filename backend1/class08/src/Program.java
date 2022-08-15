import entities.Card;
import entities.Product;
import service.impl.FacadeDiscount;

public class Program {

    public static void main(String[] args) {
        // Facade and 3 APIs instance
        FacadeDiscount facadeDiscount = new FacadeDiscount();

        // Card and Product Instance
        Card card = new Card("123456", "DH Bank");
        Product product = new Product("Lasagna", "Can");

        // facadeDiscount Execute
        int totalDiscount = facadeDiscount.discount(card, product, 15);
        System.out.println("Total Dscount: " + totalDiscount + "%") ;

    }

}
