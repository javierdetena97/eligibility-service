package com.example.eligibility_service.services;

import com.example.eligibility_service.commons.GameCreatedEvent;
import com.example.eligibility_service.commons.GameEligibleEvent;
import reactor.core.publisher.Mono;

public interface GameEligibleService {
    Mono<GameEligibleEvent> eligibilityGame(GameCreatedEvent gameCreatedEvent);
}
