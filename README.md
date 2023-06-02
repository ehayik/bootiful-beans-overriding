# Bootiful Beans Overriding 

Spring boot application proof of concept, showcasing how to use `@TestConfiguration` annotation 
along with Beans Overriding feature within tests.

## Installation

### Requirements

- Git
- JDK 17

### Setup

Clone the project:

```bash
git clone https://github.com/ehayik/bootiful-beans-overriding.git
```

Open the project folder with your favorite IDE.

IntelliJ:
```bash
idea bootiful-beans-overriding
```

VS Code:
```bash
code bootiful-beans-overriding
```

## Usage

Firstly, run the application's tests:

```bash
./gradlew test
```

Message `c.g.ehayik.bbo.TestAppConfiguration      : I test, therefore I am.` should be printed twice.

Then, Run the application:

```bash
./gradlew bootRun
```

Message `com.github.ehayik.bbo.AppConfiguration   : It works on my machine.` should be printed once.

## Credits

I learned a lot from the projects and resources listed below:

- [Testing with Spring Boot’s @TestConfiguration Annotation](https://reflectoring.io/spring-boot-testconfiguration/)
- [Spring Boot: @TestConfiguration Not Overriding Bean During Integration Test](https://stackoverflow.com/questions/50607285/spring-boot-testconfiguration-not-overriding-bean-during-integration-test)


