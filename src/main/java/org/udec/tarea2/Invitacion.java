package org.udec.tarea2;

import java.time.Instant;

/**
 * Clase Invitacion que representa una invitación a una reunión
 */
public class Invitacion {
    private Persona invitado;
    private Instant hora;

    /**
     * Constructor de la clase Invitacion
     * 
     * @param persona persona a invitar
     */
    public Invitacion(Persona persona) {
        this.invitado = persona;
        this.hora = Instant.now();
    }

    @Override
    public String toString() {
        return "Clase Invitacion que representa una invitación a una reunión";
    }

    // Getters y setters

    public Persona getInvitado() {
        return invitado;
    }

    public void setInvitado(Persona persona) {
        this.invitado = persona;
    }

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
}