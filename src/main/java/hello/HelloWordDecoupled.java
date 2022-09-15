package hello;

public class HelloWordDecoupled {
    public static void main(String[] args) {
        MessageRender mr  = new StandardMessageRender();
        MessageProvider mp = new HelloWordMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
