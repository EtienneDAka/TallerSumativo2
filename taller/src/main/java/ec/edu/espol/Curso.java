package ec.edu.espol;

import java.util.LinkedList;

public class Curso {

    private String id;
    private String nombre;
    private Boolean estadoDisponible;
    private LinkedList<Foro> foros;
    private LinkedList<ActividadSumativa> actividadesSumativas;
    private LinkedList<Estudiante> estudiantesEnEsperaDeInscripcion; 
    private LinkedList<Estudiante> estudiantesInscritos;
    
    public Curso(String id, String nombre, Boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.foros = new LinkedList<>();
        this.actividadesSumativas = new LinkedList<>();
        this.estudiantesEnEsperaDeInscripcion = new LinkedList<>();
    }

    public void agregarEstudiantesEnEspera(Estudiante e){
        estudiantesEnEsperaDeInscripcion.add(e);
    }


    public void agregarEstudiantesInscritos(Estudiante e){
        estudiantesInscritos.add(e);
    }




}
