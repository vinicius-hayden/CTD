package entities;

import java.util.ArrayList;

public class Team {

    private int id;
    private String name;
    private ArrayList<Player> playerArrayList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayerArrayList() {
        return playerArrayList;
    }

    public void setPlayerArrayList(ArrayList<Player> playerArrayList) {
        this.playerArrayList = playerArrayList;
    }
}
