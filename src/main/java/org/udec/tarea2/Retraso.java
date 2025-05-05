package org.udec.tarea2;

import java.time.Instant;

public class Retraso extends Asistencia{
    private Instant hora;

    public Retraso(Instant hora) {
        this.hora = hora;
    }

    public Instant getHora() {
        return hora;
    }
}
