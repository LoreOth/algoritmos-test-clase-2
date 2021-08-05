package com.redbeeacademy.algoritmostest.Lista.EjercicioCine;

import java.util.List;

/*
Un cine de un pueblo nos pide que generemos una aplicacion para controlar las personas de una cola.
La edad de las personas de la cola se generan aleatoriamente entre 5 y 60 años (edad minima 5 - maxímo 60).
La capacidad de la sala es de 50 personas.
Deberemos mostrar:

1) la cantidad total recaudada
2) cuantas personas entraron por cada rango de edad
3) promedio de edad por cada estreno

Precios por edad
entre 5 y 10 años ->  $100
entre 11 y 17 años -> $150
de 18 en adelante -> $200

Tenemos la clase Persona, donde vamos a usarla para modelar edad, y las propiedades que crean convenientes
 */


public class Cine {

    public static double cantidadTotalRecaudada(List<Persona> personas) {
        double cantidadTotal = 0;
        int espectadores = personas.size();
        for (int i = 0; i < espectadores; i++) {
            if ((personas.get(i).getEdad() >= 5) && (personas.get(i).getEdad() <= 10)) {
                cantidadTotal = cantidadTotal + 100;
            } else {
                if ((personas.get(i).getEdad() >= 11) && (personas.get(i).getEdad() <= 17)) {
                    cantidadTotal = cantidadTotal + 150;
                } else {
                    if ((personas.get(i).getEdad() >= 18)) {
                        cantidadTotal = cantidadTotal + 200;
                    }
                }
            }
        }
        return cantidadTotal;
    }


    public static Persona cantidadPersonas(List<Persona> personas) {
        Persona total = new Persona();
        int espectadores = personas.size();
        for (int i = 0; i < espectadores; i++) {
            if (personas.get(i) != null) {
                if ((personas.get(i).getEdad() >= 5) && (personas.get(i).getEdad() <= 10)) {
                    total.setCantNiños();
                } else {
                    if ((personas.get(i).getEdad() >= 11) && (personas.get(i).getEdad() <= 17)) {
                        total.setCantAdolesc();
                    } else {
                        if ((personas.get(i).getEdad() >= 18)) {
                            total.setCantAdult();
                        }
                    }
                }
            }
        }

        return total;


    }


    public static double promedioEdad(List<Persona> personas) {
        double suma = 0;
        int espectadores = personas.size();
        for (int i = 0; i < espectadores; i++) {
            if (personas.get(i) != null) {
                suma = suma + personas.get(i).getEdad();
            }
        }
        return (suma / espectadores);
    }
}