package ch2.hellospring.decoupled;

public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider provider;

    @Override
    public void render() {
        if (provider == null) {
            throw new RuntimeException("You must set"
                    + "the property provider of class: "
                    + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(provider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.provider;
    }
}
