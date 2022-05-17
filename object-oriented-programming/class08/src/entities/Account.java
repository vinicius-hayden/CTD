package entities;

public class Account {

    protected int num;
    protected String name;
    protected double accBalance;

    public Account(){
    }

    public Account(int num, String name) {
        this.num = num;
        this.name = name;
        this.accBalance = 0.0;
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

    @Override
    public String toString() {
        return "Account{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }
}

