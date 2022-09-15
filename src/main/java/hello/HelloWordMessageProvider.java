package hello;

public class HelloWordMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello word";
    }
}
