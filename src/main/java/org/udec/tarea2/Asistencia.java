package org.udec.tarea2;

public class Asistencia {
    
    Empleado asistente;

    public Asistencia(Empleado empleado) {
        this.asistente = empleado;
    }

    // Getters y Setters

    public Empleado getAsistente() {
        return asistente;
    }

    public void setAsistente(Empleado asistente) {
        this.asistente = asistente;
    }
}
