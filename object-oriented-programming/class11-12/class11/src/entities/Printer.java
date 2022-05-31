package entities;

import java.time.LocalDate;

public abstract class Printer {

    private String model;
    private String connectionType;
    private LocalDate manufactureDate;
    private int papersAvailable;
    private double inkPercentage;

    public Printer(){

    }

    public Printer(String model, String connectionType, LocalDate manufactureDate, int papersAvailable, double inkPercentage) {
        this.model = model;
        this.connectionType = connectionType;
        this.manufactureDate = manufactureDate;
        this.papersAvailable = papersAvailable;
        this.inkPercentage = inkPercentage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getPapersAvailable() {
        return papersAvailable;
    }

    public void setPapersAvailable(int papersAvailable) {
        this.papersAvailable = papersAvailable;
    }

    public double getInkPercentage() {
        return inkPercentage;
    }

    public void setInkPercentage(double inkPercentage) {
        this.inkPercentage = inkPercentage;
    }

    //Methods
    public boolean isTherePaper(){
        if (this.papersAvailable != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean doesItNeedInk(){
        if (this.inkPercentage == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Abstract Method
    public abstract void print();

    @Override
    public String toString() {
        return "Printer{" +
                "model='" + model + '\'' +
                ", connectionType='" + connectionType + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", papersAvailable=" + papersAvailable +
                ", inkPercentage=" + inkPercentage +
                '}';
    }
}