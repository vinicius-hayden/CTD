import entities.Account;
import entities.PFAccount;
import entities.PJAccount;

public class Program {

    public static void main(String[] args) {

        Account a1 = new Account(21444, "Peter Parker");
        System.out.println(a1);

        PFAccount cPF1 = new PFAccount(25544, "Mary Smith", "401-311-337-01");
        System.out.println(cPF1);

        PJAccount cPJ1 = new PJAccount(3788, "Mark Whistler", "327377");
        System.out.println(cPJ1);

    }

}
