package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Configuration
@ComponentScan
public class AnnotationTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//                "spring/annotation.xml");

//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.load("spring/annotation.xml");
//        context.refresh();

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationTest.class);
        Rabbit rabbit = (Rabbit) context.getBean("rabbit");
        rabbit.sayHello();
    }
}
