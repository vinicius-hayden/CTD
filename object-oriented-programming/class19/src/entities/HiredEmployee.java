package entities;

public class HiredEmployee extends Employee {

    private double valuePerHour;
    private double taxes;

    public HiredEmployee(){

    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    @Override
    public double calculateSalary(int days) {
        return ((this.valuePerHour * 8) * days) * (1-this.taxes);
    }

    @Override
    public String toString() {
        return "HiredEmployee{" +
                "valuePerHour=" + valuePerHour +
                ", taxes=" + taxes +
                '}';
    }
}
