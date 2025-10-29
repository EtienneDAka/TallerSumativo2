package ec.edu.espol;

public class PersonalAcademico extends Usuario {
    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void reportarError(String email, String contenido){
        // Lógica para reportar un error
    }

    public void solicitarAsesoramiento(String email, String contenido){
        // Lógica para solicitar asesoramiento
    }

    public void comentarEnForo(Foro foro, String comentario){
        // Lógica para comentar en un foro
    }
}
