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


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public LocalDateTime getFechaHora() {
        return fechaHora;
    }


    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public ArrayList<String> getLog_actualizaciones() {
        return log_actualizaciones;
    }


    public void setLog_actualizaciones(ArrayList<String> log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }


    public LocalDateTime getFecha_cerrado() {
        return fecha_cerrado;
    }


    public void setFecha_cerrado(LocalDateTime fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Usuario getResponsable() {
        return responsable;
    }


    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }


    public PersonalAcademico getBeneficiario() {
        return beneficiario;
    }


    public void setBeneficiario(PersonalAcademico beneficiario) {
        this.beneficiario = beneficiario;
    }
    
}
