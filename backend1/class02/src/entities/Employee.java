package entities;

public abstract class Employee {

    private String name;
    private String lastname;
    private String accountNum;


    public Employee() {
    }

    public Employee(String name, String lastname, String accountNum) {
        this.name = name;
        this.lastname = lastname;
        this.accountNum = accountNum;
    }

    public void salaryPayment(){
        double quantity;
        quantity = evaluateSalary();
        printReceipt(quantity);
        deposit(quantity);
    }

    public abstract double evaluateSalary();

    public abstract void printReceipt(double quantity);

    public abstract void deposit(double quantity);
}
