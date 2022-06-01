package entities;

public class Horse extends Animal implements AnimalsThatRun {

    public Horse(){

    }

    public Horse(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void generateSound() {
        System.out.println("The horse is neighing");
    }

    @Override
    public String toString() {
        return "Horse{ " + super.toString() + "}";
    }

    @Override
    public void run() {
        System.out.println("The horse is running!");
    }
}
