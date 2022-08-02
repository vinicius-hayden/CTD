package tests;

import entities.Efective;
import entities.Employee;
import entities.Hired;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    Employee employee1, employee2;


    @BeforeEach
    void doBefore() {
        employee1 = new Efective("John","Lupricard", "325321",
                3000, 1000, 500);

        employee2 = new Hired("Ana", "Banana", "254323",
                30, 35);

    }

    @Test

    void tests() {
        employee1.salaryPayment();
        employee2.salaryPayment();
    }


}
