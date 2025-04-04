package com.gryffindor.model;

public class Jugador {
    private String nombre;
    private String casa;

    public Jugador() {
    }

    public Jugador(String nombre, String casa) {
        this.nombre = nombre;
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}
