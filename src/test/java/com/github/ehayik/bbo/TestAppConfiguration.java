package com.github.ehayik.bbo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@Slf4j
@TestConfiguration
public class TestAppConfiguration {

    @Bean
    GreetingsService greetingsService() {
        return () -> log.info("I test, therefore I am.");
    }
}
