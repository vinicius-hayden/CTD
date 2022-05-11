package entities;

public class Player {

    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public Player(){
    }

    public Player (String nome, String nickname, int pontuacao, int nivel) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public void aumentarPontuacao(int pontos) {
        this.pontuacao = this.pontuacao + pontos;
        System.out.println("Sua pontuacao" + this.pontuacao);
    }


    public void subirNivel(int nivel) {
        this.nivel = this.nivel + nivel;
        System.out.println("Seu nível é: " + this.nivel);
    }

    public void bonus(int valorBonus){
        this.pontuacao = this.pontuacao + valorBonus;
        System.out.println("Sua pontuação nova + bônus: " +this.pontuacao);
    }

    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pontuacao=" + pontuacao +
                ", nivel=" + nivel +
                '}';
    }
}





//    public int getNumeroCliente() {
//        return numeroCliente;
//    }




