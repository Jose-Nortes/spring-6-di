package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service //Refactoring to use spring dependency injection
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service !!!";
    }
}
