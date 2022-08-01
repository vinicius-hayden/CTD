package tests;

import entities.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    Person p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<String> colectionTest = new ArrayList<String>();

    @BeforeEach

    void doBefore() {
        p1 = new Person("Ivo", "Morales");
        p1.setAge(LocalDate.of(2016, 3, 23));
        p2 = new Person("Ana", "Musk");
        p2.setAge(LocalDate.of(1966, 5, 3));
        p3 = new Person("Peter", "Parker");
        p3.setAge(LocalDate.of(1972, 6, 13));
        p4 = new Person("John", "Smith");
        p4.setAge(LocalDate.of(1983, 8, 10));
        p5 = new Person("Steven", "Rogers");
        p5.setAge(LocalDate.of(1952, 3, 7));
        p6 = new Person("Joe", "Martinez");
        p6.setAge(LocalDate.of(1932, 5, 27));
        p7 = new Person("Camila", "Morita");
        p7.setAge(LocalDate.of(2004, 6, 20));
        p8 = new Person("Drake", "Nathan");
        p8.setAge(LocalDate.of(1952, 4, 7));
        p9 = new Person("Mac", "Winkler");
        p9.setAge(LocalDate.of(2005, 10, 9));
    }

    @Test
    void printObjects() {

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);

    }



}
