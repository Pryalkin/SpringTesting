package constructors;

import org.springframework.stereotype.Component;

@Component
public class Transmision {
    private String name = "Wheel";

//    public Transmision(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Transmision{" +
                "name='" + name + '\'' +
                '}';
    }
}
