package com.github.ehayik.bbo;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(
		classes = TestAppConfiguration.class,
		properties = "spring.main.allow-bean-definition-overriding=true")
class ApplicationTests {

	@Autowired
	GreetingsService greetingsService;

	@Test
	void greetingsServiceShouldBeOverriding() {

		try (var logCaptor = LogCaptor.forClass(TestAppConfiguration.class)) {
			// When
			greetingsService.sayHello();

			// Then
			assertThat(logCaptor.getInfoLogs())
					.containsExactly("I test, therefore I am.");
		}
	}
}
