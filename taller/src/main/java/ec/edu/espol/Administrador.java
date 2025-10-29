package ec.edu.espol;

public class Administrador extends Usuario {
    public Administrador(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contrasena){
        // Lógica para crear un usuario con rol específico
    }

    public void asignarPermiso(String usuario){
        // Lógica para asignar permisos a un usuario
    }

    public void actualizarSoftware(){
        // Lógica para actualizar el software del sistema
    }

    public void asignarRespondable(Curso curso, Profesor responsable){
        // Lógica para asignar un respondable a un curso
    }
}
