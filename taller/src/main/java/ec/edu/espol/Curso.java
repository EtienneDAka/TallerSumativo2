package ec.edu.espol;

import java.util.LinkedList;

public class Curso {

    private String id;
    private String nombre;
    private Boolean estadoDisponible;
    private LinkedList<Foro> foros;
    private LinkedList<ActividadSumativa> actividadesSumativas;
    private Profesor responsable;


    public Curso(String id, String nombre, Boolean estadoDisponible, Profesor responsable) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.foros = new LinkedList<>();
        this.actividadesSumativas = new LinkedList<>();
        this.responsable = responsable;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Boolean getEstadoDisponible() {
        return estadoDisponible;
    }


    public void setEstadoDisponible(Boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }


    public LinkedList<Foro> getForos() {
        return foros;
    }


    public void setForos(LinkedList<Foro> foros) {
        this.foros = foros;
    }


    public LinkedList<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }


    public void setActividadesSumativas(LinkedList<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }


    public Profesor getResponsable() {
        return responsable;
    }


    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }





}
