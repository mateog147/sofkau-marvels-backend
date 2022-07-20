package com.sofkau.marvel;

import java.util.*;

public class Mazo {

    private String id;
    private Set<Carta> mazo;

    public Mazo(String id, List<Carta> mazo) {
        this.id = id;
        this.mazo = barajarMazo(mazo);
    }

    private Set<Carta> barajarMazo(List<Carta> mazo) {
        Collections.shuffle(mazo);
        Set<Carta> mazo_barajado = new HashSet<>();
        mazo_barajado.addAll(mazo);
        return mazo_barajado;
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

        return mazo.stream()
                .findAny()
                .get();
    }

    public int indexAleatorio() {
        return (int) Math.floor(Math.random()* (this.mazo.size() -1));
    }
}
