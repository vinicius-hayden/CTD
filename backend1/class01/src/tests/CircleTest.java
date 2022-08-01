package tests;

import entities.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {

    Circle c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;

    @BeforeEach

    void doBefore() {
        c1 = new Circle(3);
        c2 = new Circle(5);
        c3 = new Circle(7);
        c4 = new Circle(2);
        c5 = new Circle(1);
        c6 = new Circle(10);
        c7 = new Circle(9);
        c8 = new Circle(6);
        c9 = new Circle(8);
        c10 = new Circle(4);
    }

    @Test
    void printCalculus() {
        System.out.println(c1.evaluatePerimeter());
        System.out.println(c2.evaluatePerimeter());
        System.out.println(c3.evaluatePerimeter());
        System.out.println(c4.evaluatePerimeter());
        System.out.println(c5.evaluatePerimeter());
        System.out.println(c6.evaluatePerimeter());
        System.out.println(c7.evaluatePerimeter());
        System.out.println(c8.evaluatePerimeter());
        System.out.println(c9.evaluatePerimeter());
        System.out.println(c10.evaluatePerimeter());
    }

}
