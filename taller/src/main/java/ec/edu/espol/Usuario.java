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
}
