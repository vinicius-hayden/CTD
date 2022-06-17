package entities;

public class Ball extends Product {

    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSpace() {
        return (4  * Math.PI * Math.pow(this.radius, 3))/3;
    }


}
