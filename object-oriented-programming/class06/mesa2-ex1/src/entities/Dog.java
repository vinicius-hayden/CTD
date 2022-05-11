package entities;

public class Dog {

    private int idDog;
    private String raca;
    public boolean estaApto;
    public int anoNasc;
    public double peso;
    private boolean possuiChip;
    public boolean estaFerido;
    public String nome;

    public Dog(){
    }

    public Dog(int idDog, String raca, boolean estaApto, int anoNasc, double peso, boolean possuiChip, boolean estaFerido, String nome){
        this.idDog = idDog;
        this.raca = raca;
        this.estaApto = false;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.possuiChip = false;
        this.estaFerido = estaFerido;
        this.nome = nome;
    }

    public int getIdDog() {
        return idDog;
    }

    public void setIdDog(int idDog) {
        this.idDog = idDog;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isEstaApto() {
        return estaApto;
    }

    public void setEstaApto(boolean estaApto) {
        this.estaApto = estaApto;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void validar(int anoNasc, boolean possuiChip) {
        int idadeCachorro = 2022 - anoNasc;
        if (possuiChip) {
            System.out.println("A idade do cachorro é " + idadeCachorro + "anos e possui chip!");
        } else {
            System.out.println("A idade do cachorro é " +idadeCachorro + "anos e não possui chip!");
        }
    }

    public boolean aptidao(double peso, boolean estaFerido) {
        if (peso > 5 && !estaFerido){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "idDog=" + idDog +
                ", raca='" + raca + '\'' +
                ", estaApto=" + estaApto +
                ", anoNasc=" + anoNasc +
                ", peso=" + peso +
                ", possuiChip=" + possuiChip +
                ", estaFerido=" + estaFerido +
                ", nome='" + nome + '\'' +
                '}';
    }
}
