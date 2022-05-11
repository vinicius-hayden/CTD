import entities.Dog;

public class Program {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setIdDog(1);
        dog1.setNome("Arthur");
        dog1.setRaca("Bulldog");

        dog1.aptidao(5,false);
        dog1.validar(2011,false);

        System.out.println(dog1);


    }

}
