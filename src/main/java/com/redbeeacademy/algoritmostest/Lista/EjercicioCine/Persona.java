package com.redbeeacademy.algoritmostest.Lista.EjercicioCine;


public class Persona extends ListaPersonas {
    private Integer cantNiños = 0;
    private Integer cantAdolesc = 0;
    private Integer cantAdult = 0;
    private Integer edad;


    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCantNiños() {
        this.cantNiños++;
    }

    public void setCantAdolesc() {
        this.cantAdolesc++;
    }

    public void setCantAdult() {
        this.cantAdult++;
    }

    public Integer getCantNiños() {
        return cantNiños;
    }

    public Integer getCantAdolesc() {
        return cantAdolesc;
    }

    public Integer getCantAdult() {
        return cantAdult;
    }


}
