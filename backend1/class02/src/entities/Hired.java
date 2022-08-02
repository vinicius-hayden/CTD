package entities;

public class Hired extends Employee{

    private double hourValue;
    private int hours;

    public Hired(String name, String lastname, String accountNum, double hourValue, int hours) {
        super(name, lastname, accountNum);
        this.hourValue = hourValue;
        this.hours = hours;
    }

    @Override
    public double evaluateSalary() {
        return hourValue * hours;
    }

    @Override
    public void printReceipt(double quantity) {
        System.out.println("Receipt generated: Func. Hired");
    }

    @Override
    public void deposit(double quantity) {
        System.out.println("A quantity of" + quantity + "has been added to your account");
    }
}
