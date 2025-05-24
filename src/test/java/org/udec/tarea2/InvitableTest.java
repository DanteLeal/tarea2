package org.udec.tarea2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase de pruebas para la interfaz Invitable
 */
class InvitableTest {
    private Persona persona;
    private Empleado empleado1;
    private Empleado empleado2;
    private Departamento departamento;
    private ReunionVirtual reunionVirtual;
    private ReunionPresencial reunionPresencial;

    /**
     * Configura el entorno de los tests de la interfaz Invitable, creando objetos de tipo
     * Persona, Empleado y Departamento, as como ReunionVirtual y ReunionPresencial.
     */
    @BeforeEach
    void setUp() {
        persona = new Persona("1", "once", "uno", "uno@email.com" );
        empleado1 = new Empleado("2", "doce", "dos", "dos@email.com" );
        empleado2 = new Empleado("3", "trece", "tres", "tres@email.com" );
        departamento = new Departamento("Departamento de prueba");
        reunionVirtual = new ReunionVirtual(empleado1, 1, new Date(), Instant.now(), Duration.ofMinutes(30), Instant.now(), Instant.now(), "https://meet.google.com");
        reunionPresencial = new ReunionPresencial(empleado2, 1, new Date(), Instant.now(), Duration.ofMinutes(30), Instant.now(), Instant.now(), "Sala 1");
    }

    /**
     * Prueba la invitación a un departamento, creando primero un Departamento y
     * agregando dos empleados a este, y luego llamando al método invitar() con
     * una ReunionVirtual como argumento. Verifica que el n úmero de invitaciones
     * en la reunión sea igual a 2.
     */
    @Test
    @DisplayName("Invitar a departamento")
    void invitar1() {
        departamento.addEmpleado(empleado1);
        departamento.addEmpleado(empleado2);
        departamento.invitar(reunionVirtual);
        Assertions.assertEquals(2, reunionVirtual.obtenerInvitaciones().size());
    }

    /**
     * Prueba la invitación a una persona y un departamento, creando primero un
     * Departamento y agregando un empleado a este, y luego llamando al método
     * invitar() con una ReunionPresencial como argumento. Luego invita a la
     * persona y verifica que el n úmero de invitaciones en la reunión sea igual
     * a 2.
     */
    @Test
    @DisplayName("Invitar a persona y departamento")
    void invitar2() {
        departamento.addEmpleado(empleado1);
        persona.invitar(reunionPresencial);
        departamento.invitar(reunionPresencial);
        Assertions.assertEquals(2, reunionPresencial.obtenerInvitaciones().size());
    }

    /**
     * Prueba la invitación de una persona y dos empleados a una reunión
     * presencial. Llama al método invitar() para la persona, empleado1 y
     * empleado2 con una ReunionPresencial como argumento. Verifica que el
     * número de invitaciones en la reunión sea igual a 3.
     */
    @Test
    @DisplayName("Invitar a empleados y persona")
    void invitar3() {
        persona.invitar(reunionPresencial);
        empleado1.invitar(reunionPresencial);
        empleado2.invitar(reunionPresencial);
        Assertions.assertEquals(3, reunionPresencial.obtenerInvitaciones().size());
    }
}