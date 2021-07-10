package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from ConstructorGreetingService  the sevice that has been injected -  we added @Qualifier ro determined the service used";
    }
}
