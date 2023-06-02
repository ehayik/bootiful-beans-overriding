package com.github.ehayik.bbo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
class AppConfiguration {

    @Bean
    GreetingsService greetingsService() {
        return () -> log.info("It works on my machine.");
    }

    @Bean
    CommandLineRunner greetingsCommandLineRunner(GreetingsService greetingsService) {
        return args -> greetingsService.sayHello();
    }
}
