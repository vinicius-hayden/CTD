package entities;

public abstract class Animal {

    private int id;
    private String name;
    private int age;

    public Animal(){

    }

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Methods
    public abstract void generateSound();

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
