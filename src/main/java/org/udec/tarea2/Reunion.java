package org.udec.tarea2;

import java.util.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.Duration;
import java.util.ArrayList;

/*
 * Clase abstracta Reunion que define la estructura de una reunión
 */
public abstract class Reunion {

    protected Empleado organizador;

    protected Date fecha;
    protected Instant horaPrevista;
    private Duration duracionPrevista;
    protected Instant horaInicio;
    protected Instant horaFin;

    private ArrayList<Nota> notas;
    private ArrayList<Invitacion> invitaciones;
    private ArrayList<Asistencia> asistencias;

    /**
     * Constructor
     * 
     * @param organizador Empleado que organiza la reunión
     * @param fecha Fecha de la reunión
     * @param horaPrevista Hora prevista de la reunión
     * @param duracionPrevista Duración prevista de la reunión
     * @param horaInicio Hora de inicio de la reunión
     * @param horaFin Hora de fin de la reunión
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

        ArrayList<String> aux = new ArrayList<String>();

        for (int i = 0; i < asistencias.size(); i++) {
            aux.add(
                "ID: " + asistencias.get(i).getAsistente().getId() + ", " +
                "Apellidos: " + asistencias.get(i).getAsistente().getApellidos() + ", " + 
                "Nombre: " + asistencias.get(i).getAsistente().getNombre() + ", " + 
                "Correo: " + asistencias.get(i).getAsistente().getCorreo()
            );
            }

        return aux;
    }

    /**
     * Obtiene las ausencias de la reunión
     * 
     * @return Arreglo con las ausencias
     */
    public ArrayList<String> obtenerAusencias() {

        ArrayList<String> aux = new ArrayList<String>();        // Arreglo auxiliar

        for (int i = 0; i < invitaciones.size(); i++) { // Recorrer invitaciones
            boolean asistio = false;
            for (int j = 0; j < asistencias.size(); j++) { // Recorrer asistencias
                if (invitaciones.get(i).getInvitado().getId() == asistencias.get(j).getAsistente().getId()) { // Si asistio
                    asistio = true;
                    break; // Salir del bucle
                }
            }
            if (!asistio) { // Si no asistio, añadir al arreglo
                aux.add(
                    invitaciones.get(i).getInvitado().getId() + ", " +
                    invitaciones.get(i).getInvitado().getApellidos() + ", " + 
                    invitaciones.get(i).getInvitado().getNombre() + ", " + 
                    invitaciones.get(i).getInvitado().getCorreo()
                );
            }
        }

        return aux;
    }

    /**
     * Obtiene los retrasos de la reunión
     * 
     * @return Arreglo con los retrasos
     */
    public ArrayList<String> obtenerRetrasos() {
        ArrayList<String> aux = new ArrayList<String>();        // Arreglo auxiliar

        for (int i = 0; i < asistencias.size(); i++) {
            if (asistencias.get(i) instanceof Retraso) {        // Si es un retraso
                Retraso retraso = (Retraso)asistencias.get(i);  // Convertir a retraso
                aux.add(
                    "Hora: " + retraso.getHora().atZone(ZoneId.of("GMT-4")).toString() + ", " + // Obtener hora en GMT-4
                    "ID: " + retraso.getAsistente().getId() + ", " +
                    "Apellidos: "+ retraso.getAsistente().getApellidos() + ", " + 
                    "Nombre: " + retraso.getAsistente().getNombre() + ", " + 
                    "Correo: " + retraso.getAsistente().getCorreo()
                );
            }
        }

        return aux;
    }

    /**
     * Obtiene el total de asistencias
     * 
     * @return Total de asistencias 
     */
    public int obtenerTotalAsistencia() {
        return asistencias.size();
    }

    /**
     * Obtiene el porcentaje de asistencia a la reunión.
     * 
     * @return Porcentaje de asistencia calculado como el número de asistencias
     * dividido por el número de invitaciones.
     */
    public float obtenerPorcentajeAsistencia() {
        return (float)asistencias.size() / (float)invitaciones.size();
    }

    /**
     * Calcula el tiempo real de la reunión
     * 
     * @return Tiempo real en minutos   
     */
    public float calcularTiempoReal() {
        Duration duracion = Duration.between(horaInicio, horaFin);
        return duracion.toSeconds() / 60f;
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
        if (notas.size() == 0) {                                                // Verificar que la lista de notas no esté vacía
            return;
        }
        int index = nota - 1;                                                   // Calcular el índice
        if (index >= 0 && index < notas.size()) {                               // Verificar que el índice sea válido
            notas.remove(index);                                                // Eliminar la nota
        }
    }

    /**
     * Lee las notas de la reunión
     * 
     * @return Arreglo con las notas
     */
    public ArrayList<String> obtenerNotas() {
        if (notas.size() == 0) {
            return null;
        }

        ArrayList<String> aux = new ArrayList<>();

        aux.add("Notas: ");
        for (int i = 0; i < notas.size(); i++) {
            int numero = i + 1;                                                                 
            aux.add( numero + ". " + notas.get(i).getContenido());
        }

        return aux;
    }

    // Invitaciones

    /**
     * Agrega una invitación a la reunión para una persona.
     * 
     * @param persona la persona que será invitado a la reunión.
     */
    public void addInvitacion(Persona persona) {
        invitaciones.add(new Invitacion(persona));
    }

    /**
     * Obtiene las invitaciones de la reunión.
     * 
     * @return Un arreglo de cadenas con la información de las invitaciones,
     * incluyendo la hora, id, apellidos, nombre y correo del invitado.
     */
    public ArrayList<String> obtenerInvitaciones() {
        ArrayList<String> aux = new ArrayList<String>();

        for (int i = 0; i < invitaciones.size(); i++) {
                        aux.add(
                "Hora: " + invitaciones.get(i).getHora().atZone(ZoneId.of("GMT-4")).toString() + ", " + // Obtener hora en GMT-4
                "ID: " + invitaciones.get(i).getInvitado().getId() + ", " + 
                "Apellidos: "+ invitaciones.get(i).getInvitado().getApellidos() + ", " + 
                "Nombre: " + invitaciones.get(i).getInvitado().getNombre() + ", " + 
                "Correo: " + invitaciones.get(i).getInvitado().getCorreo()
            );
        }
        return aux;
    }

    // Asistencias

    /**
     * Agrega una asistencia a la reunión para una persona.
     * 
     * @param persona La persona que asistirá a la reunión.
     */
    public void addAsistencia(Persona persona) {
        asistencias.add(new Asistencia(persona));
    }

    /**
     * Agrega un retraso a la reunión para una persona.
     * 
     * @param persona La persona que asistirá a la reunión con retraso.
     */
    public void addRetraso(Persona persona) {
        asistencias.add(new Retraso(persona));
    }

    /**
     * Genera un informe de la reunión
     * 
     * @return El informe de la reunión
     */
    public abstract String elaborarInforme();

    @Override
    public String toString() {
        return "Clase abstracta Reunion que define la estructura de una reunión";
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
    public void setOrganizador(Empleado empleado) {
        this.organizador = empleado;
    }

    public Instant getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Instant horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Instant getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Instant horaFin) {
        this.horaFin = horaFin;
    }
}