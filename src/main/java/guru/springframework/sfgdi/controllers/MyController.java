package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
//@Controller stereotype: anotate de class as a Spring management component

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello world");
        return "Hi folks";
    }
}
