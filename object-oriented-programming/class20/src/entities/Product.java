package entities;

public abstract class Product {

    protected double weight;

    public abstract double calculateSpace();

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                '}';
    }
}
