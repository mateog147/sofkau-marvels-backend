package com.sofkau.marvel;

public class Carta {

    private String id;
    private String nombre;
    private Integer xp;
    private String imagen;

    public Carta(String id, String nombre, Integer xp, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.xp = xp;
        this.imagen = imagen;
    }

    public String id() {
        return id;
    }

    public Integer xp() {
        return xp;
    }

    public String imagen() {
        return imagen;
    }

    public String nombre() {
        return nombre;
    }
}
