import entities.Associate;
import entities.LicensedAssociate;

public class Main {

    public static void main(String[] args) {

        Associate a1 = new Associate("1234", "John", 1000, "Running");
        System.out.println(a1);
        LicensedAssociate l1 = new LicensedAssociate(
                "1543", "Mark", 1200
                , "Swimming", 1200, true
        );

        System.out.println(l1.monthlyCost());;

        if(l1.isLicensed()){
            System.out.println(l1.getName() + " is able to use the pool");
        } else {
            System.out.println(l1.getName() + " is not able to use the pool");
        }

    }

}
