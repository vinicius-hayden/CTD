import entities.Veterinarian;

public class Program {

    public static void main(String[] args) {

        Veterinarian vet1 = new Veterinarian();
        Veterinarian vet2 = new Veterinarian("Robert", "Winkler", "CRV-12554", 3600);

        vet1.name = "Claire";
        vet1.lastname = "Thompson";
        vet1.register = "CRV-54321";
        vet1.salary = 2600.50;
    }

}
