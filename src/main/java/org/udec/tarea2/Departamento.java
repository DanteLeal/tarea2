package org.udec.tarea2;
import java.util.ArrayList;

/**
 * Clase Departamento que representa un departamento en el que trabajan los empleados
 */
public class Departamento implements Invitable{
    private String nombre;
    private ArrayList<Empleado> empleados;

    /**
     * Constructor de la clase
     * 
     * @param nombre nombre del departamento
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<Empleado>();
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
    public void invitar(Reunion reunion) {
        System.out.println("Se ha invitado al departamento " + this.nombre);
        for (int i = 0; i < empleados.size(); i++) {
            empleados.get(i).invitar(reunion);
        }
    }

    @Override
    public String toString() {
        return "Clase que representa un departamento en el que trabajan los empleados";
    }

    // Getters y Setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
