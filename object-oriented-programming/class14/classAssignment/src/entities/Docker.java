package entities;

import java.util.ArrayList;

public class Docker {

    private int id;
    private String dockerName;
    private ArrayList<Container> containers = new ArrayList<>();

    public Docker(int id, String dockerName) {
        this.id = id;
        this.dockerName = dockerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDockerName() {
        return dockerName;
    }

    public void setDockerName(String dockerName) {
        this.dockerName = dockerName;
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

    public void addContainerToDocker(Container container) {
        containers.add(container);
    }

    // Methods

    public void listContainerOrderedById() {
        this.containers.sort(
                (o1, o2) -> o1.getId().compareTo(
                o2.getId()));
    }

    public int howManyHarmfulMaterials() {
        int i = 0;
        for(Container container: containers) {
            if (container.isTransportingHarmfulMaterials()) {
                i++;
            }
        }
        return i;
    }

}
