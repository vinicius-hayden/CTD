package entities;

public class Boleto30d extends Boleto{

    public Boleto30d(double valor) {
        super(valor);
        this.juro = 0.05; // 2%
        this.desconto = 0.05; // 10%
        this.multa = 0.1; // 5%
    }
}

