package ec.edu.espol;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Incidente {
    protected int id;
    protected DateTimeFormatter fechaHora;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected ArrayList<String> log_actualizaciones;
    protected DateTimeFormatter fecha_cerrado;
    protected String tipo;
}
