package com.sofkau.marvel.partida.entities;

import co.com.sofka.domain.generic.Entity;

public class Jugador extends Entity<JugadorId> {

    private JugadorId id;

    public Jugador(JugadorId entityId) {
        super(entityId);
    }
}
