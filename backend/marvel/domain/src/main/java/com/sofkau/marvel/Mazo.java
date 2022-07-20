package com.sofkau.marvel;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Mazo {

    private String id;
    private Set<Carta> mazo;

    public Mazo(String id, Set<Carta> mazo) {
        this.id = id;
        this.mazo = mazo;
    }

    public Set<Carta> mazo() {
        return mazo;
    }

    public String id() {
        return id;
    }

    public Set<Carta> asignarCartas(){

        Set<Carta> cartas = new TreeSet<Carta>();

        //TODO: asignacion de cartas

        return cartas;
    }

    private Carta seleccionarCarta(){

        Carta carta = mazo. .stream()
                .collect(Collections.shuffle(mazo));

        return carta;
    }

    public int indexAleatorio() {
        return (int) Math.floor(Math.random()* (this.mazo.size() -1));
    }
}
