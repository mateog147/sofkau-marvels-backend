package com.sofkau.marvel.partida.entities;


import java.util.List;

public class Jugador {

    private String id;
    private List<Carta> cartas;
    private Integer puntaje;

    public Jugador(String id) {
        this.id = id;
    }

    public Jugador(String id, List<Carta> cartas) {
        this.id = id;
        this.cartas = cartas;
    }

    public void agregarCartasAlGanar(List<Carta> carta){
        this.cartas.addAll(carta);
    }


    public void apostarCartaEnRondaActual(Carta carta){

        var eliminar =  this.cartas.stream().filter(item -> item.Id.equals(carta.Id));
        this.cartas.remove(eliminar);

    }

    public void rendirse(){
        this.cartas.clear();

    }

    public String Id() {
        return id;
    }



    public List<Carta> cartas() {
        return cartas;
    }

    public void modificarCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Integer puntaje() {
        return puntaje;
    }

    public void actualizarPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }
}
