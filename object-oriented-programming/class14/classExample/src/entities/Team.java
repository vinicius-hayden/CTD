package entities;

import java.util.ArrayList;

public class Team {

    private int id;
    private String name;
    private ArrayList<Player> playerArrayList = new ArrayList<>();

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public void addPlayer(Player player) {
        playerArrayList.add(player);
    }

    public void showTitularPlayer() {
        for(Player player: playerArrayList) {
            if (player.isTitular()) {
                System.out.println(
                        "ID" + player.getId() +
                        " - Name: " + player.getName() +
                        "- Shirt: " + player.getShirtNumber()
                );
            }
        }
    }

    public int howManyHurtPlayers() {
        int i = 0;
        for(Player player: playerArrayList) {
            if (player.isHurt() && player.isTitular()) {
                i++;
            }
        }
        return i;
    }


}
