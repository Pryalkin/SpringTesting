package test;

import test.anotation.Component;

@Component
public class Tiger implements Animal{
    private String name;
    private int id;

    public Tiger(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Tiger() {}

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
