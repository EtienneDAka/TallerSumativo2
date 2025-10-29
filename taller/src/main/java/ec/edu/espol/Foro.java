package ec.edu.espol;

public class Foro {

    private String id;
    private String tematica;
    private int numeroDeComentarios;

    public Foro(String id, String tematica, int numeroDeComentarios) {
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = numeroDeComentarios;
    }
}
