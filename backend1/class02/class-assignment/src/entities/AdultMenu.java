package entities;

public class AdultMenu extends Menu{

    private String offer;

    public AdultMenu(double startingPrice, String description, String offer) {
        super(startingPrice, description);
        this.offer = offer;
    }

    @Override
    public int evaluateSellPrice() {
        return 0;
    }

    @Override
    public void menuSetUp() {

    }
}
