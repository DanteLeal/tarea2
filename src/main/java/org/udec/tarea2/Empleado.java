package org.udec.tarea2;

/**
 * Clase Empleado que representa a un empleado que puede asistir a una reunión y trabaja en un departamento
 */
public class Empleado implements Invitable {
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
    public Empleado(String id, String apellidos, String nombre, String correo) {
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
        System.out.println("Se ha invitado al empleado " + this.nombre + " " + this.apellidos);
        reunion.addInvitacion(this);
    }

    @Override
    public String toString() {
        return "Clase Empleado que representa a un empleado que puede asistir a una reunión y trabaja en un departamento";
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
