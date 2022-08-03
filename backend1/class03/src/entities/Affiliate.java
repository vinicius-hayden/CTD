package entities;

public class Affiliate extends Salesman{

    public Affiliate(String name) {
        super.name = name;
        super.pointsPerSale = 15;
    }

    @Override
    public int evaluatePoints() {
        return this.sales * this.pointsPerSale;
    }

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

        System.out.println("Total points:" + (evaluatePoints()) + "Salesman Category: " + salesmanCategory);
    }
}
