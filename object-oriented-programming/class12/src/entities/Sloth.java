package entities;

public class Sloth extends Animal {

    public Sloth(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void generateSound() {
        System.out.println("The Sloth is sleeping!");
    }

    public void climbATree() {
        System.out.println("The Sloth is climbing the tree!");
    }

    @Override
    public String toString() {
        return "Sloth{ " + super.toString() + "}";
    }

}
