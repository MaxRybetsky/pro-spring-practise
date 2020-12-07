package ch3.collections.xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private Map<String, Object> map;
    private Properties props;
    private Set<Object> set;
    private List<Object> list;

    public void displayInfo() {
        System.out.println("Map contents:\n");
        map.entrySet().forEach(e -> System.out.println(
                "Key: " + e.getKey() + " - Value: " + e.getValue()));
        System.out.println("\nProperties contents:\n");
        props.entrySet().forEach(e -> System.out.println(
                "Key: " + e.getKey() + " - Value: " + e.getValue()));
        System.out.println("\nSet contents:\n");
        set.forEach(obj -> System.out.println("Value: " + obj));
        System.out.println("\nList contents:\n");
        list.forEach(obj -> System.out.println("Value: " + obj));
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
