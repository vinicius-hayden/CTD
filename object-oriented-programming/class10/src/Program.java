import entities.Employee;
import entities.Salesman;

public class Program {

    public static void main(String[] args) {

//        Salesman salesman1 = new Salesman(1,"Michael", "20111",2200, 525);
//
//        System.out.println(salesman1);
//        salesman1.setComission(3);
//        salesman1.setTotalSales(25.0);

        System.out.println("Employee first instance");
        Employee emp1 = new Employee(2, "Patrick", "10100", 1500.0, 220);
        System.out.println(emp1);

        System.out.println("Employee second instance");
        Employee emp2 = new Employee(3, "Arthur", "10100", 1800.0, 220);
        System.out.println(emp2);

        // Testing the object emp1 and emp2
        if (emp1.equals(emp2)) {
            System.out.println(emp1.toString() + "is the same employee as  \n" +
                    emp2.toString());
        } else {
            System.out.println(emp1.toString() + "is not the same employee as  \n" +
                    emp2.toString());
        }


    }

}
