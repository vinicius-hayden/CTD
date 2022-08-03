package entities;

public class Intern extends Salesman {

    public Intern(String name) {
        super.name = name;
        super.pointsPerSale = 5;
    }

    @Override
    public int evaluatePoints() {
        return this.sales * this.pointsPerSale;
    }

    public void showCategory() {
        String internCategory = "";

        if (evaluatePoints() < 50) {
            internCategory = "Novice Intern";
        } else if (evaluatePoints() >= 50) {
            internCategory = "Experienced Intern";
        }

        System.out.println("Total points:" + (evaluatePoints()) + "Salesman Category: " + internCategory);
    }
}
