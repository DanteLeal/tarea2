package org.udec.tarea2;

import java.util.Date;
import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;


public abstract class Reunion {

    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio;
    private Instant horaFin;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio, Instant horaFin) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public ArrayList<String> obtenerAsistencias() {

        // todo: Return temporal, cambiar a futuro
        return null;
    }

    public ArrayList<String> obtenerAusencias() {

        // todo: Return temporal, cambiar a futuro
        return null;
    }

    public ArrayList<String> obtenerRetrasos() {

        // todo: Return temporal, cambiar a futuro
        return null;
    }

    public int obtenerTotalAsistencia() {

        // todo: Return temporal, cambiar a futuro
        return 0;
    }

    public float obtenerPorcentajeAsistencia() {

        // todo: Return temporal, cambiar a futuro
        return 0.0F;
    }

    public float calcularTiempoReal() {
        // todo: Return temporal, cambiar a futuro
        return 0.0F;
    }

    public void iniciar() {

    }

    public void finalizar() {

    }
}
