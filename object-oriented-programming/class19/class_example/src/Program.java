import entities.BancoDH;

public class Program {

    public static void main(String[] args) throws Exception {

        BancoDH dh = new BancoDH();

        dh.gerarBoleto(10,1000);
        dh.gerarBoleto(30,1000);
    }

}
