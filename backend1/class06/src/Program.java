import entities.FilmeNaoHabilitadoException;
import entities.GradeDeFilmes;
import entities.GradeFilmesProxy;
import entities.Ip;

public class Program {

    public static void main(String[] args) {

        GradeFilmesProxy proxy = new GradeFilmesProxy(new GradeDeFilmes());
        proxy.setIpRec(new Ip(49, 210, 150, 6));

        try {
            String url = proxy.getFilme("O nome da rosa").getLink();
            System.out.println(url);
            System.out.println("Acesso liberado.");
        }
        catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }

    }

}