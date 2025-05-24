package org.udec.tarea2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
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

    @Override
    public String elaborarInforme() {
        String informe = "";

        informe += "Fecha: \n" + getFecha() + "\n\n";
        informe += "Hora prevista: \n" + getHoraPrevista().atZone(ZoneId.of("GMT-4")).toString() + "\n\n";
        informe += "Hora inicio: \n" + getHoraInicio().atZone(ZoneId.of("GMT-4")).toString() + "\n\n";
        informe += "Hora fin: \n" + getHoraFin() + "\n\n";
        informe += "Duracion total: \n" + calcularTiempoReal() + " minutos" + "\n\n";
        informe += "Sala: \n" + sala + "\n\n";
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
            if (i < obtenerNotas().size() - 1) {    // evitar el último salto de línea
                informe += "\n";
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("informe"))) {
            writer.println(informe);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return informe;
    }
    
    // Getters y setters
    
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
