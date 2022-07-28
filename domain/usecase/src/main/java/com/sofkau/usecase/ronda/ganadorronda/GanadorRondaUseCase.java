package com.sofkau.usecase.ronda.ganadorronda;

import com.sofkau.model.ronda.Ronda;
import com.sofkau.model.ronda.gateways.RondaRepository;
import com.sofkau.usecase.events.ApuestaAgregaEvent;
import com.sofkau.usecase.events.RondaTerminadaEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GanadorRondaUseCase {
    private final ApplicationEventPublisher publisher;
    private final RondaRepository repository;

    public Mono<Ronda> terminarRonda (Ronda ronda, String nombreGanador) {

        if(ronda.getApuestas().size()<=0){
            ronda.next();
            ronda.setUltimoGanador(nombreGanador);
        }
        return repository.save(ronda)
                .doOnSuccess(ronda1 -> this.publisher.publishEvent(new RondaTerminadaEvent(ronda1)));
    }
}
