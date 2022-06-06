package entities;

public class Player {

    private int id;
    private int shirtNumber;
    private String name;
    private boolean isHurt;
    private boolean titular;

    public Player(int id, int shirtNumber, String name, boolean isHurt, boolean titular) {
        this.id = id;
        this.shirtNumber = shirtNumber;
        this.name = name;
        this.isHurt = isHurt;
        this.titular = titular;
    }
}
