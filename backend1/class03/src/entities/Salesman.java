package entities;

public abstract class Salesman {

    protected String name;
    protected int sales = 0;
    protected int pointsPerSale;


    public void sell(int qtdSales) {
        this.sales = qtdSales;
        System.out.println(this.name + " has " + qtdSales + " sales");
    }

    /* Method that evaluates salesman points with your aspects being considered */
    public abstract int evaluatePoints();

    public void showCategory() {
        String salesmanCategory = "";
        if (evaluatePoints() < 20) {
            salesmanCategory = "Beginner";
        } else if (evaluatePoints() >= 20 && evaluatePoints() <= 30) {
            salesmanCategory = "Apprentice";
        } else if (evaluatePoints() >= 31 && evaluatePoints() <= 40) {
            salesmanCategory = "Good";
        } else if (evaluatePoints() > 40) {
            salesmanCategory = "Master";
        }

        System.out.println("Total points: " + " space " + evaluatePoints() + " " + "   Salesman Category: " + salesmanCategory);
    }

}
