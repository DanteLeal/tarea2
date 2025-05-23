package org.udec.tarea2;

/**
 * Clase Externo que representa a un externo que puede asistir a una reunión
 */
public class Externo implements Invitable {
    private String id;
    private String apellidos;
    private String nombre;
    private String correo;

    /**
     * Constructor
     * 
     * @param id
     * @param apellidos
     * @param nombre
     * @param correo
     */
    public Externo(String id, String apellidos, String nombre, String correo) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.correo = correo;
    }

    /**
     * Invita al empleado
     */
    @Override
    public void invitar(Reunion reunion) {
        System.out.println("Se ha invitado al externo " + this.nombre + " " + this.apellidos);
        reunion.addInvitacion(this);
    }

    @Override
    public String toString() {
        return "Clase Externo que representa a un externo que puede asistir a una reunión";
    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
