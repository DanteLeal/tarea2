package org.udec.tarea2;

/**
 * Clase Persona que representa a una persona que puede asistir a una reunión
 */
public class Persona implements Invitable {
    private String id;
    private String nombre;
    private String apellidos;
    private String correo;

    /**
     * Constructor
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param correo
     */
    public Persona (String id, String nombre, String apellidos, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    /**
     * Invita a la persona a la reunión
     * 
     * @param reunion La reunión a la que se invita la persona
     */
    public void invitar(Reunion reunion) {
        System.out.println("Se ha invitado a la persona " + this.nombre + " " + this.apellidos);
        reunion.addInvitacion(this);
    }

    // Getters y Setters

    @Override
    public String toString() {
        return "Clase Persona que representa a una persona que puede asistir a una reunión";
    }

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
