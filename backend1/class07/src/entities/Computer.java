package entities;

public class Computer {

    private int id;
    private int ram;
    private int hd;
    private int counter = 0;

    public Computer(int id, int ram, int hd) {
        this.id = id;
        this.ram = ram;
        this.hd = hd;
        counter++;
        System.out.println("Instance Counter: " + counter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", ram=" + ram +
                ", hd=" + hd +
                ", counter=" + counter +
                '}';
    }
}
