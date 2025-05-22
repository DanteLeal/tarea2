package org.udec.tarea2;

import java.util.Date;
import java.util.List;
import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

/*
 * Clase abstracta Reunion que define la estructura de una reunión
 */
public abstract class Reunion {

    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio;
    private Instant horaFin;

    //private Invitacion invitacio;
    private List<Nota> notas;

    /*
     * Constructor
     */
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
        return 0;
    }

    public float calcularTiempoReal() {
        return java.time.Duration.between(horaInicio, horaFin).toMinutes();
    }

    public void iniciar() {
        horaInicio = Instant.now();
    }

    public void finalizar() {
        horaFin = Instant.now();
    }

    public void addNota(Nota nota) {
        List<Nota> notas = new ArrayList<Nota>();
        notas.add(nota);
    }

    public void removeNota(Nota nota) {
        List<Nota> notas = new ArrayList<Nota>();
        notas.remove(nota);
    }

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Instant getHoraPrevista() {
        return horaPrevista;
    }

    public void setHoraPrevista(Instant horaPrevista) {
        this.horaPrevista = horaPrevista;
    }

    public Duration getDuracionPrevista() {
        return duracionPrevista;
    }

    public void setDuracionPrevista(Duration duracionPrevista) {
        this.duracionPrevista = duracionPrevista;
    }
}
