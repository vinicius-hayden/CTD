package entities;

public abstract class Menu {

    private double startingPrice;
    private String description;

    public Menu(double startingPrice, String description) {
        this.startingPrice = startingPrice;
    }

    public abstract int evaluateSellPrice();

    public abstract void menuSetUp();

}
