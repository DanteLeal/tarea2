package org.udec.tarea2;

import java.time.Instant;

/**
 *  Clase Retraso que representa un retraso en una reunión
 */
public class Retraso extends Asistencia {
    private Instant hora;

    /**
     * Constructor
     * 
     * @param empleado empleado que llega tarde
     * @param hora hora a la que llega el empleado
     */
    public Retraso(Empleado empleado) {
        super(empleado);
        this.hora = Instant.now();
    }

    // Getters y Setters

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
}
