package entities;

public class Salesman extends Employee {

    private int comission;
    private double totalSales;

    public Salesman(int id, String name, String file, double salary, double discount) {
        super(id, name, file, salary, discount);
    }

    public void setComission(int comission) {
        this.comission = comission;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double salaryCalculator() {
        return salary + (totalSales/ 199 * comission) - discount;
    }

    @Override
    public double salaryCalculator(double bonus) {
        return salary + bonus + (totalSales/ 199 * comission) - discount;
    }

}
