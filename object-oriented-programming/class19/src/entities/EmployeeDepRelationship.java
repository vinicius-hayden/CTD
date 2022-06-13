package entities;

public class EmployeeDepRelationship extends Employee{

    private double monthSalary;

    public EmployeeDepRelationship() {

    }

    public EmployeeDepRelationship(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public EmployeeDepRelationship(String name, String lastName, String archive, double monthSalary) {
        super(name, lastName, archive);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculateSalary(int days) {
        return 0;
    }
}
