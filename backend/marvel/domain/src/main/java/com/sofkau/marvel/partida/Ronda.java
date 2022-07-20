package com.sofkau.marvel.partida;

import co.com.sofka.domain.generic.Entity;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Ronda  {

    private RondaId id;
    private Set<Carta> cartas;
    private Set<Apuesta> apuestas;

    public Ronda(RondaId entityId) {
        this.id = Objects.requireNonNull(entityId);
    }

    public void agregarapuesta(String jugadorId, Carta carta){
        cartas.add(carta);

        apuestas.add(new Apuesta(jugadorId, carta.xp()));
    }

    public String determinarGanador(){
        if(apuestas.size() <= 1){
            throw new IllegalArgumentException("debe tener un minimo de dos apuestas");
        }

        return apuestas.stream()
                .max(Comparator.comparingInt(Apuesta::xpCarta))
                .get().jugadorId();
    }
}
