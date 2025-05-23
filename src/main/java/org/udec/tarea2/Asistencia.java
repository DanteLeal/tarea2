package org.udec.tarea2;

public class Asistencia {
    
    Empleado empleado;

    public Asistencia(Empleado empleado) {
        this.empleado = empleado;
    }

    // Getters y Setters

    public Empleado getAsistente() {
        return empleado;
    }

    public void setAsistente(Empleado empleado) {
        this.empleado = empleado;
    }
}
