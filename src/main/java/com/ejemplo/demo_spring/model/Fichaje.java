package com.ejemplo.demo_spring.model;

public class Fichaje {
    private String jugador;
    private String posicion;
    private String rol;

    public Fichaje(String jugador, String posicion, String rol) {
        this.jugador = jugador;
        this.posicion = posicion;
        this.rol = rol;
    }

    public String getJugador() { return jugador; }
    public String getPosicion() { return posicion; }
    public String getRol() { return rol; }
}