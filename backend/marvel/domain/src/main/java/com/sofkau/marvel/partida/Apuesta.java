package com.sofkau.marvel.partida;

import co.com.sofka.domain.generic.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Apuesta  {

    private String jugadorId;
    private Integer xpCarta;

    public String jugadorId() {
        return jugadorId;
    }

    public Integer xpCarta() {
        return xpCarta;
    }

}
