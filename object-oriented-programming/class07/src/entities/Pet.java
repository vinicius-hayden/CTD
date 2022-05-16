package entities;

public class Pet {

    private final String breed;

    public Pet(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Pet { " +
                "breed='" + breed + '\'' +
                '}';
    }
}
