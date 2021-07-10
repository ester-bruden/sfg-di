package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstractorInjectionControlerTest {
ConstructorInjectionControler controler;
    @BeforeEach
    void setUp() {
        controler = new ConstructorInjectionControler(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controler.getGreeting());
    }
}