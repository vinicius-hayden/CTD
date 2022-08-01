package entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String lastname;
    private LocalDate age;
    private List<String> colection = new ArrayList<>();

    public Person() {
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public List<String> addNames(Person person) {
        int var = person.getName().length();
        int age = person.calcAge();

        if (var >= 5 && age >= 18) {
            colection.add(person.getName());
            System.out.println(colection);
        }
        return null;
    }

    public int calcAge() {
        int ageCalc = Period.between(this.age, LocalDate.of(2022, 8, 1)).getYears();
        return ageCalc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
