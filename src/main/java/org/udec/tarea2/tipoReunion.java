package org.udec.tarea2;

/**
 * Clase Enum que representa los tipos de reuniones
 */
public enum tipoReunion {
    TECNICA("1", "Reunión técnica enfocada en aspectos de desarrollo o infraestructura"),
    MARKETING("2", "Reunión para discutir estrategias y acciones de marketing"),
    OTRO("3", "Otro tipo de reunión no clasificada");

    private String id;
    private String descripcion;

    /**
     * Constructor
     * 
     * @param id
     * @param descripcion
     */
    tipoReunion(String id, String descripcion) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
