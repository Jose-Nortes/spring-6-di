package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl; // SpringBoot does not need it anymore
import org.junit.jupiter.api.BeforeEach; // SpringBoot does not need it anymore
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController constructorInjectedController;
//    @BeforeEach
// void setUp() {
//     this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
// }

    @Test
    void sayHello() {
        System.out.println(this.constructorInjectedController.sayHello());
    }
}