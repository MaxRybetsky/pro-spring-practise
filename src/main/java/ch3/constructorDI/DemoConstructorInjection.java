package ch3.constructorDI;

import ch3.cdl.Container;
import ch3.cdl.DefaultContainer;
import ch3.cdl.Dependency;

public class DemoConstructorInjection {
    public static void main(String[] args) {
        Container container = new DefaultContainer();
        ConstructorInjection constructorInjection =
                new ConstructorInjection((Dependency) container.getDependency("myDependency"));
        System.out.println(constructorInjection);
    }
}
