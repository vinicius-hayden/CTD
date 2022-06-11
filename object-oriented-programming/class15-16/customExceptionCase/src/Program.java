import entities.Client;
import entities.exception.clientException;

public class Program {

    public static void main(String[] args) throws clientException {

        Client c1 = new Client("Ibson", "Junior", "123", 500);

        try {
            c1.deposit(500);
            c1.buy(300);
            c1.obtainLoan(2000);
            System.out.printf("Current Loan: $ %.2f%n", c1.getLoan());

            System.out.println(" ");
            System.out.printf("Current account balance: $ %.2f%n", c1.getAccBalance());
            System.out.printf("Current limit: $ %.2f%n", c1.getLimit());
            System.out.printf("Account balance + current limit: $ %.2f%n", (c1.getAccBalance() + c1.getLimit()));

            System.out.println(" ");
            c1.payLoan(1000);
            System.out.printf("Current Loan: $ %.2f%n", c1.getLoan());
        }
        catch (clientException e) {
            System.err.println(e.toString());
        }
        finally {
            System.out.println("All clear!");
        }

    }

}
