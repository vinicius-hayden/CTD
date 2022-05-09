package entities;

public class Veterinarian {

    //attributes
    public String name;
    public String lastname;
    public String register;

    public double salary;

    //constructor
    public Veterinarian() {
    }
    //arguments constructor
    public Veterinarian(String name, String lastname, String register, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.register = register;
        this.salary = salary;
    }

}
