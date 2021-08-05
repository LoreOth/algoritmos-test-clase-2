package com.redbeeacademy.algoritmostest.Lista;

import com.redbeeacademy.algoritmostest.Lista.EjercicioCine.Cine;
import com.redbeeacademy.algoritmostest.Lista.EjercicioCine.Persona;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CineTest {

    @Test
    @DisplayName("Tests happy path total recaudado")
    public void testHappyPathTotalRecaudado() {
        Double result = Cine.cantidadTotalRecaudada(List.of(new Persona(30), new Persona(17), new Persona(8), new Persona(18) ));
        assertNotNull(result, "The result cannot be null");
        assertEquals(650, result);
    }

    @Test
    @DisplayName("Test when null values are sent total recaudado")
    public void testNullValuesTotalRecaudado() {
        Double result = Cine.cantidadTotalRecaudada(List.of(new Persona(30), new Persona(17), new Persona(8), new Persona(18) ));
        assertNotNull(result, "The result cannot be null");
        assertEquals(650, result);

    }

    @Test
    @DisplayName("Tests happy path cantidad personas")
    public void testHappyPathCantidadPersonas() {
       Persona  result = Cine.cantidadPersonas(List.of(new Persona(30), new Persona(17), new Persona(8), new Persona(18) ));
        //assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.getCantNiños());
        assertEquals(1, result.getCantAdolesc());
        assertEquals(2, result.getCantAdult());
    }

    @Test
    @DisplayName("Test when null values are sent cantidad personas")
    public void testNullValuesCantidadPersonas() {
        Persona result = Cine.cantidadPersonas(List.of(new Persona(30), null, new Persona(8), new Persona(18) ));  // consultar cuál es el problema.-
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.getCantNiños());
        assertEquals(0, result.getCantAdolesc());
        assertEquals(2, result.getCantAdult());
    }

    @Test
    @DisplayName("Tests happy path")
    public void testHappyPathPromedioEdad() {
        Double result = Cine.promedioEdad(List.of(new Persona(30), new Persona(17), new Persona(8), new Persona(18) ));
        assertNotNull(result, "The result cannot be null");
        assertEquals(18.25, result);
    }

    @Test
    @DisplayName("Test when null values are sent promedio edad")
    public void testNullValuesPromedioEdad() {
        Double result = Cine.promedioEdad(List.of(new Persona(30), null, new Persona(8), new Persona(18) ));  // consultar cuál es el problema.-
        assertNotNull(result, "The result cannot be null");
        assertEquals(18.66, result);
    }
}
