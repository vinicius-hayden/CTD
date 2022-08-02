package entities;

public class KidsMenu extends Menu {

    private String surpriseGift;
    private String supriseGift;
    private double additionalCost;

    public KidsMenu(double startingPrice, String description, String surpriseGift, double additionalCost) {
        super(startingPrice, description);
        this.surpriseGift = surpriseGift;
        this.additionalCost = additionalCost;
    }


    @Override
    public int evaluateSellPrice() {
        return 0;
    }

    @Override
    public void menuSetUp() {

    }
}
