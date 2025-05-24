package org.udec.tarea2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReunionTest {

    ReunionPresencial reunion;
    Empleado empleado;

    @BeforeEach
    void setUp() {
        empleado = new Empleado("1", "Apellido", "Nombre", "correo@example.com");
        reunion = new ReunionPresencial(empleado, 1, new Date(), Instant.now(), Duration.ofMinutes(30), Instant.now(), Instant.now(), "Sala 1");
    }

    @AfterEach
    void tearDown() {
        reunion = null;
    }

    @Test
    void obtenerAsistencias() {
        reunion.addAsistencia(empleado);
        assertNotNull(reunion.obtenerAsistencias());
    }

    @Test
    void obtenerAusencias() {
        reunion.addInvitacion(empleado);
        assertNotNull(reunion.obtenerAusencias());
    }

    @Test
    void obtenerRetrasos() {
        reunion.addRetraso(empleado);
        assertNotNull(reunion.obtenerRetrasos());
    }

    @Test
    void obtenerTotalAsistencia() {
        reunion.addAsistencia(empleado);
        assertEquals(1, reunion.obtenerTotalAsistencia());
    }

    @Test
    void obtenerPorcentajeAsistencia() {
        reunion.addInvitacion(empleado);
        reunion.addAsistencia(empleado);
        assertEquals(1.0, reunion.obtenerPorcentajeAsistencia());
    }

    @Test
    void calcularTiempoReal() {
        reunion.iniciar();
        reunion.finalizar();
        assertNotNull(reunion.calcularTiempoReal());
    }

    @Test
    void iniciar() {
        assertDoesNotThrow(() -> reunion.iniciar());
    }

    @Test
    void finalizar() {
        reunion.iniciar();
        assertDoesNotThrow(() -> reunion.finalizar());
    }

    @Test
    void obtenerInvitaciones() {
        reunion.addInvitacion(empleado);
        assertEquals(1, reunion.obtenerInvitaciones().size());
    }

    @Test
    void elaborarInforme() {
        reunion.addNota("Nota 1");
        String informe = reunion.elaborarInforme();
        assertTrue(informe.contains("Nota 1"));
    }
}
