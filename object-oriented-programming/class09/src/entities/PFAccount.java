package entities;

public class PFAccount extends Account{

    private final String cpf;

    public PFAccount(int num, String name, double value, String cpf) {
        super(num, name, value);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
