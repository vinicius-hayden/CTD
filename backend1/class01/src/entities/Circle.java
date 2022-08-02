package entities;

public class Circle extends Figure{

    public double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    public double getRay() {
        return ray;
    }

    @Override
    public double evaluatePerimeter() {
        return (2 * Math.PI) * getRay();
    }

}
