package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;
//@Controller stereotype: anotate de class as a Spring management component

@Controller
public class MyController {

    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
