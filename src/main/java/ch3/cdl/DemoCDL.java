package ch3.cdl;

public class DemoCDL {
    public static void main(String[] args) {
        Container container = new DefaultContainer();
        ManagedComponent managedComponent = new ContextualizedDependencyLookup();
        managedComponent.performLookup(container);
        System.out.println(managedComponent);
    }
}
