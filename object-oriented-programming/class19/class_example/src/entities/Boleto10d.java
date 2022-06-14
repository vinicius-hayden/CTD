package entities;

public class Boleto10d extends Boleto{

    public Boleto10d(double valor) {
        super(valor);
        this.juro = 0.02; // 2%
        this.desconto = 0.1; // 10%
        this.multa = 0.05; // 5%
    }
}
