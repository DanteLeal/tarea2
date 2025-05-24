package org.udec.tarea2;

/**
 * Clase Empleado que representa a un empleado que puede asistir a una reunión y trabaja en un departamento
 */
public class Empleado extends Persona {

    /**
     * Constructor
     * 
     * @param id
     * @param apellidos
     * @param nombre
     * @param correo
     */
    public Empleado(String id, String apellidos, String nombre, String correo) {
        super(id, apellidos, nombre, correo);
    }

    /**
     * Invita al empleado
     */
    @Override
    public void invitar(Reunion reunion) {
        System.out.println("Se ha invitado al empleado " + getNombre() + " " + getApellidos());
        reunion.addInvitacion(this);
    }

    @Override
    public String toString() {
        return "Clase Empleado que representa a un empleado que puede asistir a una reunión y trabaja en un departamento";
    }

    // Getters y Setters

    public String getId() {
        return super.getId();
    }

    public void setId(String id) {
        super.setId(id);
    }

    public String getApellidos() {
        return super.getApellidos();
    }

    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos);
    }

    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getCorreo() {
        return super.getCorreo();
    }

    public void setCorreo(String correo) {
        super.setCorreo(correo);
    }
}
