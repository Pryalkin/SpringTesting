package constructors;

public class MotoBike {
    private Engine engine;
    private Transmision transmision;
    private String name;

    public MotoBike(Engine emgine, Transmision transmision, String name) {
        this.engine = emgine;
        this.transmision = transmision;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "emgine=" + engine +
                ", transmision=" + transmision +
                ", name='" + name + '\'' +
                '}';
    }
}
