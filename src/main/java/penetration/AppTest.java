package penetration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/penetrationcontext.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car.getModel());
        System.out.println(car.getDeviceModel());
    }
}
