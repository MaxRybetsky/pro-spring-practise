package ch3.methinj.annotated;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abstractLookupBean")
public class AbstractLookupDemoBean implements DemoBean {
    @Lookup("singer")
    public Singer getMySinger() {
        return null; // overridden dynamically
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
