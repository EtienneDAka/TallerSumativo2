package ec.edu.espol;

public class Profesor extends PersonalAcademico{
     
    public Profesor(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }
      
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //Lógica para cargar una actividad sumativa en un curso       
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
        //Lógica para calificar una actividad sumativa de un estudiante en un curso
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        //Lógica para aceptar la inscripción de un estudiante en un curso
    }

    public void nuevoForo(Foro foro) {
        //Lógica para crear un nuevo foro
    }

    
}
