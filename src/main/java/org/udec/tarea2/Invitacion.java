package org.udec.tarea2;

import java.time.Instant;

/**
 * Clase Invitacion que representa una invitación a una reunión
 */
public class Invitacion {
    private Empleado invitado;
    private Instant hora;

    /**
     * Constructor de la clase Invitacion
     * 
     * @param empleado empleado a invitar
     */
    public Invitacion(Empleado empleado) {
        this.invitado = empleado;
        this.hora = Instant.now();
    }

    // Getters y setters

    public Empleado getInvitado() {
        return invitado;
    }

    public void setInvitado(Empleado empleado) {
        this.invitado = empleado;
    }

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
}
