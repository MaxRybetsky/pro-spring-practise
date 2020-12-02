package ch3.services;

import ch2.hellospring.decoupled.MessageProvider;
import ch2.hellospring.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StdOutput implements MessageRenderer {
    private MessageProvider provider;

    @Override
    public void render() {
        if(provider == null) {
            throw new RuntimeException("Provider is null!");
        }
        System.out.println(provider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.provider;
    }
}
