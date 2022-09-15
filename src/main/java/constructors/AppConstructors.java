package constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructors {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructor.xml");
        MotoBike motoBike = context.getBean(MotoBike.class);
        System.out.println(motoBike);
    }
}
