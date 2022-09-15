package hello;

public class HelloWordDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRender mr  = MessageSupportFactory.getInstance().getMessageRender();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
