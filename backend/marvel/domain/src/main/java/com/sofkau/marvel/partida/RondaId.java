package com.sofkau.marvel.partida;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;
import java.util.UUID;

public class RondaId extends Identity {

    private final String uuid;

    public RondaId() {
        this.uuid =  UUID.randomUUID().toString();
    }

    private RondaId(String uuid) {
        this.uuid = (String) Objects.requireNonNull(uuid, "Identity can´t be null");
        if (this.uuid.isBlank()) {
            throw new IllegalArgumentException("Identity can´t be blank");
        }
    }

    public static RondaId of(String id){
        return  new RondaId(id);
    }
}
