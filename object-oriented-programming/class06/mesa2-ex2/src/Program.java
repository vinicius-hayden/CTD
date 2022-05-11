import entities.Printer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat();
        Printer impressora = new Printer();
        impressora.setTipoConexao("Sem fio");
        impressora.setModelo("Epson");
        impressora.setDataFabricacao(new Date());

    }

}
