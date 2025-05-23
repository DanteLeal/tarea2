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
     * @param invitable persona que llega tarde
     * @param hora hora a la que llega el empleado
     */
    public Retraso(Invitable invitable) {
        super(invitable);
        this.hora = Instant.now();
    }
    
    @Override
    public String toString() {
        return "Clase Retraso que representa un retraso en una reunión";
    }

    // Getters y Setters

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
}
