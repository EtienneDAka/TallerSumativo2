package ec.edu.espol;

public class SoporteTecnico extends Usuario{
    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }
    
    public void brindarAsistencia(Usuario usuario){
        // Lógica para brindar asistencia técnica
    }

    public void resolverProblemaTecnico(Usuario usuario){
        // Lógica para resolver problemas técnicos
    }

    public void derivarProblemaDeGestion(Administrador admin){
        // Lógica para derivar problemas de gestión al administrador
    }
    
}
