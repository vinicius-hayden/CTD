package tests;

import entities.Employee;
import entities.Salesman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    Salesman salesman1, salesman2;

    @BeforeEach
    void doBefore() {
        salesman1 = new Employee("Roberto", 5);
        salesman2 = new Employee("Pedro", 6);
    }

    @Test
    void tests() {
        salesman1.sell(2);
        salesman1.showCategory();
        salesman2.sell(4);
        salesman2.showCategory();
    }

}
