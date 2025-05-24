package org.udec.tarea2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

class DepartamentoTest {

    private Departamento departamento;
    private Empleado e1;
    private Empleado e2;
    private Empleado e3;
    private Reunion reunion;

    @BeforeEach
    void setUp() {
        departamento = new Departamento("Departamento de prueba");
        e1 = new Empleado("1", "once", "uno", "uno@email.com" );
        e2 = new Empleado("2", "dos", "dos", "dos@email.com" );
        e3 = new Empleado("3", "tres", "tres", "tres@email.com" );
        reunion = new ReunionVirtual(e1, 1, new Date(), Instant.now(), Duration.ofMinutes(30), Instant.now(), Instant.now(), "https://meet.google.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Añadir empleados al departamento y contarlos")
    void obtenerCantidadEmpleados() throws Exception {

        departamento.obtenerCantidadEmpleados();
    }

    @Test@DisplayName("")

    void testAddEmpleado() {
        departamento.addEmpleado(e1);
        departamento.addEmpleado(e2);
        departamento.addEmpleado(e3);
        assertEquals(3, departamento.obtenerCantidadEmpleados());
    }

    @Test
    void removeEmpleado() {
        departamento.addEmpleado(e1);
        departamento.addEmpleado(e2);
        departamento.addEmpleado(e3);
        departamento.removeEmpleado(e1);
        departamento.removeEmpleado(e2);
        departamento.removeEmpleado(e3);
        assertEquals(0, departamento.obtenerCantidadEmpleados());
    }

    @Test
    void invitar() {
        departamento.addEmpleado(e1);
        departamento.addEmpleado(e2);
        departamento.addEmpleado(e3);
        departamento.invitar(reunion);
        assertEquals(3, reunion.obtenerInvitaciones().size());
    }
}