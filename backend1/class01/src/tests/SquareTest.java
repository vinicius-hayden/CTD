package tests;

import entities.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquareTest {

    Square s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;

    @BeforeEach

    void doBefore() {
        s1 = new Square(5);
        s2 = new Square(10);
        s3 = new Square(2);
        s4 = new Square(3);
        s5 = new Square(4);
        s6 = new Square(9);
        s7 = new Square(20);
        s8 = new Square(7);
        s9 = new Square(8);
        s10 = new Square(9);
    }

    @Test
    void printCalculus() {
        System.out.println(s1.evaluatePerimeter());
        System.out.println(s2.evaluatePerimeter());
        System.out.println(s3.evaluatePerimeter());
        System.out.println(s4.evaluatePerimeter());
        System.out.println(s5.evaluatePerimeter());
        System.out.println(s6.evaluatePerimeter());
        System.out.println(s7.evaluatePerimeter());
        System.out.println(s8.evaluatePerimeter());
        System.out.println(s9.evaluatePerimeter());
        System.out.println(s10.evaluatePerimeter());
    }
}
