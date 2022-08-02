package entities;

public class Efective extends Employee{

    private double salaryBase;
    private double discounts;
    private double bonifications;

    public Efective(String name, String lastname, String accountNum, double salaryBase, double discounts, double bonifications) {
        super(name, lastname, accountNum);
        this.salaryBase = salaryBase;
        this.discounts = discounts;
        this.bonifications = bonifications;
    }

    @Override
    public double evaluateSalary() {
        return salaryBase + bonifications - discounts;
    }

    @Override
    public void printReceipt(double quantity) {
        System.out.println("Receipt generated - Func. Effective.");
    }

    @Override
    public void deposit(double quantity) {
        System.out.println("A quantity of" + quantity + "has been added to your account");
    }
}
