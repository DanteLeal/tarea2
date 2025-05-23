package org.udec.tarea2;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase que representa una reunión virtual a la que asisten los empleados por medio de un enlace
 */
public class ReunionVirtual extends Reunion {
    private String enlace;

    /**
     * Constructor de la clase ReunionVirtual
     * 
     * @param organizador organizador de la reunión
     * @param fecha fecha de la reunión
     * @param horaPrevista hora prevista de la reunión
     * @param duracionPrevista duración prevista de la reunión
     * @param horaInicio hora de inicio de la reunión
     * @param horaFin hora de finalización de la reunión
     * @param enlace enlace de la reunión virtual
     */
    public ReunionVirtual(Empleado organizador, Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio, Instant horaFin, String enlace) {
        super(organizador, fecha, horaPrevista, duracionPrevista, horaInicio, horaFin);
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Clase ReunionVirtual que representa una reunión virtual a la que asisten los empleados por medio de un enlace";
    }

    //Setters y Getters

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }


}
