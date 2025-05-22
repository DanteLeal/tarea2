package org.udec.tarea2;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionPresencial extends Reunion{
    private String sala;

    public ReunionPresencial(Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio, Instant horaFin, String sala) {
        super(fecha, horaPrevista, duracionPrevista, horaInicio, horaFin);
        this.sala = sala;
    }

    // Getters y setters
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

}
