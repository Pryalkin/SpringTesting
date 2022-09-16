package constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructor.xml");
        Engine engine = context.getBean(Engine.class);
        System.out.println(engine);
        Transmision transmision = context.getBean(Transmision.class);
        System.out.println(transmision);
    }
}
