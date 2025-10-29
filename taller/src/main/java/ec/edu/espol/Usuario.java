package ec.edu.espol;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    public Usuario(String usuario, String contrasena, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }
}
