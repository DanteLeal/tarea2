package org.udec.tarea2;

/**
 * Clase Asistencia que representa una asistencia a una reunión
 */
public class Asistencia {
    
    Persona asistente;

    /**
     * Constructor
     * 
     * @param persona persona asistente
     */
    public Asistencia(Persona persona) {
        this.asistente = persona;
    }

    @Override
    public String toString() {
        return "Clase Asistencia que representa una asistencia a una reunión";
    }

    // Getters y Setters

    public Persona getAsistente() {
        return asistente;
    }

    public void setAsistente(Persona persona) {
        this.asistente = persona;
    }
}