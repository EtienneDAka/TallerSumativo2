package ec.edu.espol;

import java.util.LinkedList;

public class PersonalAcademico extends Usuario {
    
    protected LinkedList<Incidente> incidentes;
    
    
    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        this.incidentes = new LinkedList<>();
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
