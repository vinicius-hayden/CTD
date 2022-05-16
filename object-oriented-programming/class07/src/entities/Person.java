package entities;

public class Person {

    private String name;
    private Pet dog;

    public Person(String name, Pet dog){
        this.name = name;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person { " +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }

}

