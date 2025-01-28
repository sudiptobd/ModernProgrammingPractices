package lab11.prob2;

import java.util.ArrayList;
import java.util.List;

public class Group<T> {
    private T specialElement;
    private List<T> elements = new ArrayList<>();
    public Group(T special, List<T> elements) {
        this.specialElement = special;
        this.elements = elements;
    }

    public T getSpecialElement() {
        return specialElement;
    }

    public List<T> getElements() {
        return elements;
    }

    public <U> Group<U> copyOfHelper(Group<U> group) {
        List<U> elements = group.getElements();
        U special = group.getSpecialElement();
        return new Group<>(special, elements);
    }

    public static Group<?> copyOf(Group<?> group) {
        return group.copyOfHelper(group); // Delegate to the helper method
    }

    /*
    public static Group<?> copyOf(Group<?> group) {
        List<?> elements = group.getElements();
        Group<?> grp = new Group<?>(group.getSpecialElement(), group.getElements());
        return grp;
    }
    */
}