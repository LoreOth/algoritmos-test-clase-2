package com.redbeeacademy.algoritmostest.Mapa;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


/*
Empelando la clase HashMap<String,Integer>() de la biblioteca de java (una
implementación de tablas hash con un string (nombre) de clave y un entero (telefono) de valor)

1) crear un nuevo contacto
2) modificar un telefono
3) obtener un telefono
4) eliminar un telefono
5) devolver telefonos

 */
public class Agenda {

    private static HashMap<String, Integer> miAgenda =
            new HashMap<>();

    public static void nuevoContacto(String nombre, int telefono) {
        miAgenda.put(nombre, telefono);
    }

    public static void modificarTelefono(String nombre, int telefono) {
        for (HashMap.Entry<String, Integer> entry : miAgenda.entrySet()) {
            System.out.println(entry.getKey());
            if (entry.getKey().equals(nombre)) {
                miAgenda.replace(nombre, telefono);
            }
        }
    }

    public static Integer obtenerTelefono(String nombre) {

        for (HashMap.Entry<String, Integer> entry : miAgenda.entrySet()) {
            if (entry.getKey().equals(nombre)) {
                return entry.getValue();
            }
        }
        return null;
    }


    public static boolean eliminarTelefono(String nombre) {
        for (HashMap.Entry<String, Integer> entry : miAgenda.entrySet()) {
            if (entry.getKey().equals(nombre)) {
                miAgenda.remove(nombre);
                return true;
            }
        }
        return false;
    }

    protected static List<Integer> miAgenda() {
        return miAgenda.values().stream().collect(Collectors.toList());
    }

}
