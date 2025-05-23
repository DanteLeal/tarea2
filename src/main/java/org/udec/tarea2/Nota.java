package org.udec.tarea2;

/**
 * Clase Nota que representa una nota que se agrega a una reunión
 */
public class Nota {
    private String contenido;

    /**
     * Constructor
     * 
     * @param contenido
     */
    public Nota(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Clase Nota que representa una nota que se agrega a una reunión";
    }

    // Getters y Setters

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
