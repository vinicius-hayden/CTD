package entities;

public class GradeFilmesProxy implements  IGradeDeFilmes{

    private GradeDeFilmes gradeDeFilmes;
    private Ip ipRec;

    public GradeFilmesProxy(GradeDeFilmes gradeDeFilmes) {
        this.gradeDeFilmes = gradeDeFilmes;
    }

    public Ip getIpRec() {
        return ipRec;
    }

    public void setIpRec(Ip ipRec) {
        this.ipRec = ipRec;
    }

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {

        Filme f = gradeDeFilmes.getFilme(nomeDoFilme);

        System.out.println("País do filme: " + f.getPais());
        System.out.println("País do solicitante: " + getIpRec().getPais());

        // Só entra no IF se forem diferentes
        if (!(getIpRec().getPais()).equalsIgnoreCase(f.getPais())) {
            throw new FilmeNaoHabilitadoException(nomeDoFilme + " não disponível no(a) "
                    + getIpRec().getPais() + ".");
        }

        return f;
    }

    public void setFilme(GradeDeFilmes filme) {
        this.gradeDeFilmes = filme;
    }

}
