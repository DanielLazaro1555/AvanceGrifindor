package com.gryffindor.model;

public class HechizoMensaje {
    private String jugador;
    private String hechizo;

    public HechizoMensaje() {}

    public HechizoMensaje(String jugador, String hechizo) {
        this.jugador = jugador;
        this.hechizo = hechizo;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getHechizo() {
        return hechizo;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }
}
