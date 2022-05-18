package entities;

public class Account {

    protected int num;
    protected String name;
    protected double accBalance;

    protected double limit;

    public Account(){
    }

    public Account(int num, String name, double value) {
        this.num = num;
        this.name = name;
        this.accBalance = 0.0;
        this.limit = value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public double getLimit() {
        return limit;
    }

    // Custom Methods

    public void deposit(double value) {
        if(value > 0){
            this.accBalance += value;
            System.out.printf("Current Account Balance: %.2f%n", getAccBalance());
        } else {
            System.out.println("Invalid Value, Please try again!");
        }

    }

    public void withdrawal(double value){
        if (value <= (getAccBalance() + getLimit())){
            this.accBalance -= value;
        } else {
            System.out.println("Value exceeded, please try again");
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }
}

