package entities;

public class Veterinarian {

    //attributes
    public String name;
    public String lastname;
    public String register;

    //constructor
    public Veterinarian() {
    }
    //arguments constructor
    public Veterinarian(String name, String lastname, String register) {
        this.name = name;
        this.lastname = lastname;
        this.register = register;
    }

}
