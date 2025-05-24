package org.udec.tarea2;

/**
 * Clase Enum que representa los tipos de reuniones
 */
public enum tipoReunion {
    TECNICA(1, "Reunión técnica enfocada en aspectos de desarrollo o infraestructura"),
    MARKETING(2, "Reunión para discutir estrategias y acciones de marketing"),
    OTRO(3, "Otro tipo de reunión no clasificada");

    private int id;
    private String descripcion;

    /**
     * Constructor
     * 
     * @param id representa el id del tipo de reunion
     * @param descripcion representa la descripcion del tipo de reunion
     */
    tipoReunion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "Clase Enum que representa los tipos de reuniones";
    }

    // Getters y Setters
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
