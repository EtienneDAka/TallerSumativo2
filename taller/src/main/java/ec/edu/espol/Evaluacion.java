package ec.edu.espol;

import java.time.LocalDateTime;

public class Evaluacion extends ActividadSumativa{
    private int limiteDetiempo;

    public Evaluacion (String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, String id, int limiteDetiempo) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, id);
        this.limiteDetiempo = limiteDetiempo;
    }
}
