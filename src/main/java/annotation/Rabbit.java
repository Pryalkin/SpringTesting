package annotation;

import org.springframework.stereotype.Component;

@Component
public class Rabbit {
    void sayHello() {
        System.out.println("Hello");
    }
}
