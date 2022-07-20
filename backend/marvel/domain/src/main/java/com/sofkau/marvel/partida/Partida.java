package com.sofkau.marvel.partida;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.marvel.Mazo;
import com.sofkau.marvel.partida.entities.Jugador;

import java.util.Set;

public class Partida extends AggregateEvent<PartidaId> {
    private  PartidaId id;
    private Set<Jugador> jugadores;
    private Set<Ronda> rondas;
    private Mazo mazo;

    public Partida(PartidaId entityId) {
        super(entityId);
    }
}
