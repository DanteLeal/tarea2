package org.udec.tarea2;

import java.time.Instant;

public class Retraso extends Asistencia {
    private Instant hora;

    public Retraso(Empleado empleado, Instant hora) {
        super(empleado);
        this.hora = Instant.now();
    }

    // Getters y Setters

    public Instant getHora() {
        return hora;
    }
}
