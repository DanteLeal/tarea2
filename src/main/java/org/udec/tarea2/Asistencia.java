package org.udec.tarea2;

/**
 * Clase Asistencia que representa una asistencia a una reunión
 */
public class Asistencia {
    
    Empleado asistente;

    /**
     * Constructor
     * 
     * @param empleado empleado asistente
     */
    public Asistencia(Empleado empleado) {
        this.asistente = empleado;
    }

    @Override
    public String toString() {
        return "Clase Asistencia que representa una asistencia a una reunión";
    }

    // Getters y Setters

    public Empleado getAsistente() {
        return asistente;
    }

    public void setAsistente(Empleado empleado) {
        this.asistente = empleado;
    }
}