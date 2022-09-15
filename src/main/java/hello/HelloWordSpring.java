package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWordSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/appcontext.xml");
        MessageRender mr = ctx.getBean("render", MessageRender.class);
        mr.render();
    }
}
