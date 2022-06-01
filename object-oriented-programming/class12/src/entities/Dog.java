package entities;

public class Dog extends Animal implements AnimalsThatRun {

    public Dog(){

    }

    public Dog(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void generateSound() {
        System.out.println("The dog is barking!");
    }

    @Override
    public String toString() {
        return "Dog{ " + super.toString() + "}";
    }

    @Override
    public void run() {
        System.out.println("The Dog is running!");
    }
}
