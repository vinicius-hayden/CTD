package entities;

public class Square extends Figure{

    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double evaluatePerimeter() {
        return 4 * getSide();
    }

}
