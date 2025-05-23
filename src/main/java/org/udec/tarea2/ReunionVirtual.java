package org.udec.tarea2;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
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

    @Override
    public String elaborarInforme() {
        String informe = "";

        informe += "Fecha: \n" + fecha + "\n\n";
        informe += "Hora prevista: \n" + horaPrevista.atZone(ZoneId.of("GMT-4")).toString() + "\n\n";
        informe += "Hora inicio: \n" + horaInicio.atZone(ZoneId.of("GMT-4")).toString() + "\n\n";
        informe += "Hora fin: \n" + horaFin + "\n\n";
        informe += "Duracion total: \n" + calcularTiempoReal() + " minutos" + "\n\n";
        informe += "Enlace: \n" + enlace + "\n\n";
        informe += "Lista de participantes: \n";
        for (int i = 0; i < obtenerAsistencias().size(); i++) {
            informe += obtenerAsistencias().get(i);
            informe += "\n";
        }
        informe += "\n";
        informe += "Información sobre retrasos:\n";
        for (int i = 0; i < obtenerRetrasos().size(); i++) {
            informe += obtenerRetrasos().get(i);
            informe += "\n";
        }
        informe += "\n";
        for (int i = 0; i < obtenerNotas().size(); i++) {
            informe += obtenerNotas().get(i);
            informe += "\n";
        }

        return informe;
    }

    //Setters y Getters

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }


}
