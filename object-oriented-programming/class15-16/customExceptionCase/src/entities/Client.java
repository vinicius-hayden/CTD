package entities;

import entities.exception.clientException;

public class Client {

    private String name;
    private String lastName;
    private String rg;
    private double accBalance;
    private double limit;
    private double loan;

    public Client(String name, String lastName, String rg, double limit) {
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.accBalance = 0.0;
        this.limit = limit;
        this.loan = 0.0;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public double getLimit() {
        return limit;
    }

    public double getLoan() {
        return loan;
    }

    // Class Methods

    public void deposit(double value) throws clientException {
        if (value <= 0) {
            throw new clientException("Invalid deposit value");
        } else {
            accBalance += value;
        }

    }

    public void buy(double value) throws clientException {
        if ((accBalance + limit) < value) {
            throw new clientException("Insufficient Balance");
        } else {
            accBalance -= value;
        }
    }

    public void obtainLoan(double value) throws clientException {
        if (value <= 0) {
            throw new clientException("Type a value greater than zero.");
        } else {
            loan += value;
        }
    }

    public void payLoan(double value) throws clientException {
        if (loan <= 0) {
            throw new clientException("You don't have any loans to pay");
        }
        else {
            loan -= value;
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }
}
