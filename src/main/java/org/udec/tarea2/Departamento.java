package org.udec.tarea2;
import java.util.List;

public class Departamento implements Invitable{
    private String nombre;
    private List<Empleado> empleados;

    /**
     * Constructor de la clase
     * 
     * @param nombre nombre del departamento
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad de empleados
     *  
     * @return cantidad de empleados  
     */
    public int obtenerCantidadEmpleados() {
        return empleados.size();
    }

    /**
     * Agrega un empleado al departamento
     * 
     * @param empleado empleado a agregar
     */
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Elimina un empleado del departamento
     * 
     * @param empleado empleado a eliminar
     */
    public void removeEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    /**
     * Invita a todos los empleados del departamento
     */
    @Override
    public void invitar() {
        for (int i = 0; i < empleados.size(); i++) {
            empleados.get(i).invitar();
        }
    }
}
