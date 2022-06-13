package entities;

public abstract class Employee {

    private String name;
    private String lastName;
    private String archive;

    public Employee(){
    }

    public Employee(String name, String lastName, String archive) {
        this.name = name;
        this.lastName = lastName;
        this.archive = archive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public abstract double calculateSalary(int days);

}
