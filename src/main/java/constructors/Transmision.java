package constructors;

public class Transmision {
    private String name;

    public Transmision(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transmision{" +
                "name='" + name + '\'' +
                '}';
    }
}
