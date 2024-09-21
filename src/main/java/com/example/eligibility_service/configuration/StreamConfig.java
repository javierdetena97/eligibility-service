package com.example.eligibility_service.configuration;

import com.example.eligibility_service.commons.GameCreatedEvent;
import com.example.eligibility_service.commons.GameEligibleEvent;
import com.example.eligibility_service.processors.EligibilityGameProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Configuration
public class StreamConfig {
    @Bean
    public Function<Flux<GameCreatedEvent>, Flux<GameEligibleEvent>> gameCreatedBinding(final EligibilityGameProcessor processor) {
        return processor::process;
    }
}
