import entities.Account;
import entities.PFAccount;
import entities.PJAccount;

public class Program {

    public static void main(String[] args) {

//        Account a1 = new Account(21444, "Peter Parker");
//        System.out.println(a1);

        PFAccount cPF1 = new PFAccount(25544, "Mary Smith", 500.0, "401-311-337-01");
        System.out.println(cPF1);

        cPF1.deposit(500.0);
        System.out.println(cPF1);

        cPF1.withdrawal(300.0);
        System.out.println(cPF1);

        PJAccount cPJ1 = new PJAccount(3788, "Mark Whistler", 300.0, "304-403-4530");
        System.out.println(cPJ1);

    }

}
