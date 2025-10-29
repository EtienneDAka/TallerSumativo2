package ec.edu.espol;

import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa{
    private LocalDateTime fechaDePublicacion;

    public Tarea(String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, String id, LocalDateTime fechaDePublicacion) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }

}
