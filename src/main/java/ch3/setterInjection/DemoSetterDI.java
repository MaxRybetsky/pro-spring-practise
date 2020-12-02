package ch3.setterInjection;

import ch3.cdl.Container;
import ch3.cdl.DefaultContainer;
import ch3.cdl.Dependency;

public class DemoSetterDI {
    public static void main(String[] args) {
        Container container = new DefaultContainer();
        SetterInjection setterInjection = new SetterInjection();
        setterInjection.setDependency((Dependency) container.getDependency("myDependency"));
        System.out.println(setterInjection);
    }
}
