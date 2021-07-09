package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstractorInjectionControlerTest {
ConstractorInjectionControler controler;
    @BeforeEach
    void setUp() {
        controler = new ConstractorInjectionControler(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controler.getGreeting());
    }
}