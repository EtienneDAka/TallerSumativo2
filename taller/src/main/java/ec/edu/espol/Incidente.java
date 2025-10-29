package ec.edu.espol;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Incidente {
    protected int id;
    protected LocalDateTime fechaHora;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected ArrayList<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
}
