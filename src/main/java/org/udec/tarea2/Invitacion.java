package org.udec.tarea2;

import java.time.Instant;

/**
 * Clase Invitacion que representa una invitación a una reunión
 */
public class Invitacion {
    private Invitable invitado;
    private Instant hora;

    /**
     * Constructor de la clase Invitacion
     * 
     * @param invitable persona a invitar
     */
    public Invitacion(Invitable invitable) {
        this.invitado = invitable;
        this.hora = Instant.now();
    }

    @Override
    public String toString() {
        return "Clase Invitacion que representa una invitación a una reunión";
    }

    // Getters y setters

    public Invitable getInvitado() {
        return invitado;
    }

    public void setInvitado(Invitable invitable) {
        this.invitado = invitable;
    }

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
}
