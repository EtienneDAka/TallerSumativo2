package ec.edu.espol;

import java.util.LinkedList;

public class Estudiante extends PersonalAcademico{
    
    private LinkedList<Curso> cursosInscritos;
    
    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        this.cursosInscritos = new LinkedList<>();
    }

    public void solicitarInscripcion(Curso curso){
        // Lógica para solicitar inscripción a un curso
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        // Lógica para realizar una actividad sumativa
    }
    
    public void agregarCursoInscrito(Curso c){
        cursosInscritos.add(c);
    }
}
