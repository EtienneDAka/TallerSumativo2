package ec.edu.espol;

import java.util.LinkedList;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    protected LinkedList<Incidente> incidentes;

    public Usuario(String usuario, String contrasena, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidentes = new LinkedList<>();
    }

    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LinkedList<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(LinkedList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
    
}
