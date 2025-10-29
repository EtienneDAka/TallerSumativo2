package ec.edu.espol;

public class Estudiante extends PersonalAcademico{
    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void solicitarInscripcion(Curso curso){
        // Lógica para solicitar inscripción a un curso
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        // Lógica para realizar una actividad sumativa
    }
}
