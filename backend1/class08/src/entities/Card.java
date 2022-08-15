package entities;

public class Card {

    private String number;
    private String bank;

    public Card() {
    }

    public Card(String number, String bank) {
        this.number = number;
        this.bank = bank;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}
