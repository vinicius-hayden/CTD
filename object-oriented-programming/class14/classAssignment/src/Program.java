import entities.Container;
import entities.Docker;

public class Program {

    public static void main(String[] args) {

        Container container1 = new Container(2, "Description", "Germany", false);
        Container container2 = new Container(1, "Description", "Albany", true);
        Container container3 = new Container(3, "Description", "Japan", false);
        Container container4 = new Container(5, "Description", "Australia", false);
        Container container5 = new Container(4, "Description", "India", true);

        Docker docker1 = new Docker(1, "Buenos Aires Docker");

        docker1.addContainerToDocker(container1);
        docker1.addContainerToDocker(container2);
        docker1.addContainerToDocker(container3);
        docker1.addContainerToDocker(container4);
        docker1.addContainerToDocker(container5);

        System.out.println("Sort by...");
        docker1.listContainerOrderedById();
        System.out.println(docker1.getContainers());
        System.out.println(" ");
        System.out.println("How many Harmful materials?");
        System.out.println(docker1.howManyHarmfulMaterials());

    }

}
