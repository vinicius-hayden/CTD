package entities;

public class Employee {

    private int id;
    private String name;
    private String file;
    protected double salary;
    protected double discount;

    public Employee() {
    }

    public Employee(int id, String name, String file, double salary, double discount) {
        this.id = id;
        this.name = name;
        this.file = file;
        this.salary = salary;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Salary calculator method

    public double salaryCalculator() {
        return salary - discount;
    }

    public double salaryCalculator(double bonus) {
        return (salary + bonus) - discount;
    }

    // Override Object Superclass methods
    @Override
    public boolean equals(Object obj) {
        if(obj == null|| this.getClass() != obj.getClass()){
            return false;
        }
        Employee employee = (Employee) obj;
        return this.getFile().equals(employee.getFile());
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * name.hashCode();
        hash = hash * file.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", file='" + file + '\'' +
                ", salary=" + salary +
                ", discount=" + discount +
                '}';
    }
}
