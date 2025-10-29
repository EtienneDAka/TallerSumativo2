package ec.edu.espol;

public class Curso {

    private String id;
    private String nombre;
    private Boolean estadoDisponible;

    public Curso(String id, String nombre, Boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
    }

}
