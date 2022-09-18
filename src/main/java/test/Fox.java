package test;

import test.anotation.Component;

@Component
public class Fox {
    private String name;
    private int id;

    public Fox(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Fox() {}

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
