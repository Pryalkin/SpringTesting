package test;

public class AppTest {
    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory("test");
        Tiger tiger = (Tiger) factory.getBean("tiger");
        System.out.println(tiger.toString());
    }
}
