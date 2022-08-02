package tests;

import entities.Circle;
import entities.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FigureTest {

    Square square;
    Circle circle;

    @BeforeEach
    void doBefore() {
        square = new Square(2);
        circle = new Circle(2);
    }

    @Test
    void searchPerimeterCircle() {
        Assertions.assertEquals(8, circle.evaluatePerimeter());
    }

    @Test
    void searchPerimeterSquare() {
        Assertions.assertEquals(8, square.evaluatePerimeter());
    }

}
