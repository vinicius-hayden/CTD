package entities;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String cnpj;
    private List<Employee> employeeList = new ArrayList<>();

    public Company(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calculateTotalSalary(int days) {
        double total = 0;
        for (Employee employee: employeeList) {
            total += employee.calculateSalary(days);
        }
        return total;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void listEmployee() {
        for (Employee list: employeeList) {
            System.out.println(list);
        }
    }

}
