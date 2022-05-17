package entities;

public class PJAccount extends Account{

    private final String cnpj;

    public PJAccount(int num, String name, String cnpj) {
        super(num, name);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
