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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHurt() {
        return isHurt;
    }

    public void setHurt(boolean hurt) {
        isHurt = hurt;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
