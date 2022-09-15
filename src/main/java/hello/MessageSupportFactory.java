package hello;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private MessageProvider provider;
    private MessageRender render;

    public MessageSupportFactory() {
        properties = new Properties();
        try {
            properties.load(new FileReader("D:/БГУИР/Курс Ylab/SpringTesting/src/main/java/msf.properties"));
            String renderClass = properties.getProperty("render.class");
            String providerClass = properties.getProperty("provider.class");
            render = (MessageRender) Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance(){
        return instance;
    }

    public MessageRender getMessageRender(){
        return render;
    }

    public MessageProvider getMessageProvider(){
        return provider;
    }
}
