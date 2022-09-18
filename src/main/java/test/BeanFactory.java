package test;

import test.anotation.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private static Map<String, Object> beansPool = new HashMap<>();

    public BeanFactory(String basePackage) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Enumeration<URL> resources = classLoader.
                    getResources(basePackage.replace(".", "/"));
            while (resources.hasMoreElements()){
                File dir = new File(resources.nextElement().toURI());
                for (File f: dir.listFiles()) {
                    if (f.getName().endsWith("class")){
                        String fileName = f.getName().
                                substring(0, f.getName().lastIndexOf("."));
                        Class classObj = Class.forName(basePackage + "." + fileName);
                        if (classObj.isAnnotationPresent(Component.class)){
                            Object obj = classObj.newInstance();
                            beansPool.put(fileName.toLowerCase(), obj);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String beanName){
        return beansPool.get(beanName.toLowerCase());
    }

    public static void main(String[] args) {

        beansPool.forEach((key, value) -> System.out.println(key));
//        String path = "D:\\БГУИР\\Курс Ylab\\SpringTesting\\src\\main\\java\\test";
//        File dir = new File(path);
//        for (String s: dir.list((File d, String name) -> name.toLowerCase().endsWith("java"))) {
//            System.out.println(s);
//        }
    }
}
