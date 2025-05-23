package org.udec.tarea2;

import java.time.Instant;

/**
 * Clase Invitacion que representa una invitación a una reunión
 */
public class Invitacion {
    private Invitable invitable;
    private Instant hora;

    /**
     * Constructor de la clase Invitacion
     * 
     * @param invitable empleado a invitar
     */
    public Invitacion(Invitable invitable) {
        this.invitable = invitable;
        this.hora = Instant.now();
    }

    // Getters y setters

    public Invitable getInvitable() {
        return invitable;
    }

    public void setInvitable(Invitable invitable) {
        this.invitable = invitable;
    }

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
}
