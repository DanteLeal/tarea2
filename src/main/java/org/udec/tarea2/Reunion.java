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

    private Empleado organizador;

    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio;
    private Instant horaFin;

    private ArrayList<Nota> notas;
    private ArrayList<Invitacion> invitaciones;
    private ArrayList<Asistencia> asistencias;

    /*
     * Constructor
     */
    public Reunion(Empleado organizador, Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio, Instant horaFin) {
        this.organizador = organizador;

        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;

        this.notas = new ArrayList<Nota>();
        this.invitaciones = new ArrayList<Invitacion>();
        this.asistencias = new ArrayList<Asistencia>();
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

    /**
     * Inicia la reunión
     */
    public void iniciar() {
        horaInicio = Instant.now();
    }

    /**
     * Finaliza la reunión
     */
    public void finalizar() {
        horaFin = Instant.now();
    }

    // Notas

    /**
     * Agrega una nota a la reunión
     * 
     * @param nota
     */
    public void addNota(String nota) {
        notas.add(new Nota(nota));
    }

    /**
     * Elimina una nota de la reunión
     * 
     * @param nota
     */
    public void removeNota(int nota) {
        if (notas.size() == 0) {
            return;
        }
        int index = nota - 1;                                                   // Calcular el índice
        if (index >= 0 && index < notas.size()) {                               // Verificar que el índice sea válido
            notas.remove(index);                                                // Eliminar la nota
        }
    }

    /**
     * Lee las notas de la reunión
     */
    public void readNotas() {
        if (notas.size() == 0) {
            return;
        }
        for (int i = 0; i < notas.size(); i++) {
            int numero = i + 1;                                                                 
            System.out.println("Nota " + numero + ": " + notas.get(i).getContenido());
        }
    }

    // Invitaciones

    public void addInvitacion(Invitable invitable) {
        invitaciones.add(new Invitacion(invitable));
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

    public Empleado getOrganizador() {
        return organizador;
    }
    public void setOrganizador(Empleado organizador) {
        this.organizador = organizador;
    }

}
