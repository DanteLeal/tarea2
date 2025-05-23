package org.udec.tarea2;

/**
 * Clase Asistencia que representa una asistencia a una reunión
 */
public class Asistencia {
    
    Invitable asistente;

    /**
     * Constructor
     * 
     * @param invitable persona asistente
     */
    public Asistencia(Invitable invitable) {
        this.asistente = invitable;
    }

    @Override
    public String toString() {
        return "Clase Asistencia que representa una asistencia a una reunión";
    }

    // Getters y Setters

    public Invitable getAsistente() {
        return asistente;
    }

    public void setAsistente(Invitable invitable) {
        this.asistente = invitable;
    }
}
