package entities;

public class Associate {

    private String associateNum;
    private String name;
    private double monthlyPayment;
    private String activity;

    public Associate(String associateNum, String name, double monthlyPayment, String activity) {
        this.associateNum = associateNum;
        this.name = name;
        this.monthlyPayment = monthlyPayment;
        this.activity = activity;
    }

    public String getAssociateNum() {
        return associateNum;
    }

    public void setAssociateNum(String associateNum) {
        this.associateNum = associateNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    //Methods

    public double monthlyCost(){
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "associateNum='" + associateNum + '\'' +
                ", name='" + name + '\'' +
                ", monthlyPayment=" + monthlyPayment +
                ", activity='" + activity + '\'' +
                '}';
    }
}
