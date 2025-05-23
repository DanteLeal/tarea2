package org.udec.tarea2;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase ReunionPresencial que representa una reunión presencial a la que asisten los empleados por una sala
 */
public class ReunionPresencial extends Reunion {
    private String sala;

    /**
     * Constructor de la clase ReunionPresencial
     * 
     * @param organizador organizador de la reunión
     * @param fecha fecha de la reunión
     * @param horaPrevista hora prevista de la reunión
     * @param duracionPrevista duración prevista de la reunión
     * @param horaInicio hora de inicio de la reunión
     * @param horaFin hora de finalización de la reunión
     * @param sala sala de la reunión presencial
     */
    public ReunionPresencial(Empleado organizador, Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio, Instant horaFin, String sala) {
        super(organizador , fecha, horaPrevista, duracionPrevista, horaInicio, horaFin);
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Clase ReunionPresencial que representa una reunión presencial a la que asisten los empleados por una sala";
    }
    // Getters y setters
    
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

}
