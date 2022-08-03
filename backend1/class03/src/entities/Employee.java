package entities;

import java.util.ArrayList;

public class Employee extends Salesman {

    public int yearsAntiquity;
    public ArrayList<Salesman> affiliates = new ArrayList<>();

    public Employee(String name, int yearsAntiquity){
        super.name = name;
        super.pointsPerSale = 5;
        this.yearsAntiquity = yearsAntiquity;
    }

    public void addAffiliate(Salesman affiliate) {
        this.affiliates.add(affiliate);
        System.out.println(affiliate.name + "now is an affiliate from" + super.name);
    }

    //Salesman abstract method implementation
    // For each year of antiquity, 5 points per sale and 10 points per affiliate are added.
    @Override
    public int evaluatePoints() {
        return (this.affiliates.size() * 10 + (this.yearsAntiquity * 5));
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
