package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired //Refactoring to use spring dependency injection
    GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();

    }
}
