package ec.edu.espol;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Incidente {
    protected int id;
    protected LocalDateTime fechaHora;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected ArrayList<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    private Usuario responsable;
    protected PersonalAcademico beneficiario;


    public Incidente(int id, LocalDateTime fechaHora, String estado, String titulo, String descripcion, String tipo) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = new ArrayList<>();
        this.tipo = tipo;
    }
}
