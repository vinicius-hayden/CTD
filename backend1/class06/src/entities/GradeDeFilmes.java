package entities;

public class GradeDeFilmes implements IGradeDeFilmes {

    @Override
    public Filme getFilme(String nomeDoFilme) {

        Filme f = null;

        switch (nomeDoFilme) {
            case "The White Tiger":
                f = new Filme("The White Tiger", "Argentina", "www.wtiger.com");
                break;
            case "His Houser":
                f = new Filme("His Houser", "Brasil", "www.hhouser.com");
                break;
            case "Over the moon":
                f = new Filme("Over the moon", "Colômbia", "www.omoon.com");
                break;
            case "Superbad":
                f = new Filme("Superbad", "Argentina", "www.sbad.com");
                break;
            case "O nome da rosa":
                f = new Filme("O nome da rosa", "Colômbia", "www.nomerosa.com");
                break;
            default:
                System.out.println("Filme inexistente.");
        }

        return f;
    }
}