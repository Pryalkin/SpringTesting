package constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MotoBike {

    private EngineInterface engine;
    private Transmision transmision;
    private String name;

    @Autowired
    public MotoBike(@Qualifier("engine") EngineInterface engine, Transmision transmision, @Value("Toyota") String name) {
        this.engine = engine;
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
