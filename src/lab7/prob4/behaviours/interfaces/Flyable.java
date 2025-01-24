package lab7.prob4.behaviours.interfaces;

public interface Flyable {
    default void fly() {
        System.out.println("fly with wings");
    }
}

