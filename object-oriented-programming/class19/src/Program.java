import entities.Company;
import entities.Employee;
import entities.FactoryEmployee;

public class Program {

    public static void main(String[] args) {

        Company company = new Company("132.456.789/001-55");

        FactoryEmployee factory = FactoryEmployee.getInstance();
        System.out.println(factory.hashCode());

        company.addEmployee(factory.createEmployee("EMP-INT"));
        company.addEmployee(factory.createEmployee("EMP-EXT"));

        company.addEmployee(factory.createEmployee("EMP-EXT"));
        company.addEmployee(factory.createEmployee("EMP-INT"));

        System.out.println("Company's CNPJ" + company.getCnpj());
        company.listEmployee();

    }

}
