package entities;

public class LicensedAssociate extends Associate{

    private double swimmingCost;
    private boolean licensed;

    public LicensedAssociate(String associateNum, String name, double monthlyPayment, String activity, double swimmingCost, boolean licensed) {
        super(associateNum, name, monthlyPayment, activity);
        this.swimmingCost = swimmingCost;
        this.licensed = licensed;
    }

    public double getSwimmingCost() {
        return swimmingCost;
    }

    public void setSwimmingCost(double swimmingCost) {
        this.swimmingCost = swimmingCost;
    }

    public boolean isLicensed() {
        return licensed;
    }

    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }

    @Override
    public double monthlyCost(){
        return this.getMonthlyPayment() + swimmingCost;
    }

    @Override
    public String toString() {
        return "LicensedAssociate{" +
                "swimmingCost=" + swimmingCost +
                ", licensed=" + licensed +
                '}';
    }
}
