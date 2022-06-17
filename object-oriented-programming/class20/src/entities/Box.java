package entities;

public class Box extends Product {

    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateSpace() {
        return length * height * width;
    }
}
