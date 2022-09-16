package constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("engine")
@PropertySource("classpath:modelCar.properties")
public class Engine implements EngineInterface{
    private String name;

    public Engine(@Value("${model.device:some value}") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
