package entities;

import java.util.Date;

public class Printer {

    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private int folhasDisponiveis;

    public Printer(){
    }

    public Printer(String modelo, String tipoConexao, Date dataFabricacao, int folhasDisponiveis){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel(){
        if(folhasDisponiveis > 0){
            return true;
        } else {
           return false;
        }
    }

    public void imprimir(String texto){
        System.out.println(texto);
    }

}
