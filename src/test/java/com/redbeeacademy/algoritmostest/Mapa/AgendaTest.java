package com.redbeeacademy.algoritmostest.Mapa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class AgendaTest extends Agenda{

    @Test
    @DisplayName("Tests happy path add")
    public void testHappyPathAdd() {
        Agenda.nuevoContacto("Laura", 1131391);

        assertTrue(miAgenda().contains(1131391));
    }

    @Test
    @DisplayName("Tests happy path modify")
    public void testHappyPathModify() {
        Agenda.nuevoContacto("Laura", 1131391);
        Agenda.modificarTelefono("Laura", 1131392);

        assertTrue(miAgenda().contains(1131392));
    }

    @Test
    @DisplayName("Tests happy path show value")
    public void testHappyPathShowValue() {
        Agenda.nuevoContacto("Lore", 2215930);
        Integer telefono = Agenda.obtenerTelefono("Lore");

        assertEquals(2215930, telefono);
    }

    @Test
    @DisplayName("Tests happy path eliminated true")
    public void testHappyPathEliminatedTrue() {
        Agenda.nuevoContacto("Laura", 1131392);
        Boolean eliminado = Agenda.eliminarTelefono("Laura");

        assertTrue(eliminado);
    }

    @Test
    @DisplayName("Tests happy path eliminated false")
    public void testHappyPathEliminatedFalse() {
        Agenda.nuevoContacto("Laura", 1131391999);
        Boolean eliminado = Agenda.eliminarTelefono("Barbara");

        assertFalse(eliminado);
    }

    @Test
    @DisplayName("Tests happy path collection of telephones")
    public void testHappyPathCollectionOfTelephones() {
        Agenda.nuevoContacto("Laura", 1131391);
        List<Integer> listaTelefonos = Agenda.miAgenda();
        System.out.println(listaTelefonos);
        assertTrue(listaTelefonos.contains(1131391));
    }

}
