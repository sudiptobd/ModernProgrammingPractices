package lab7.prob4.behaviours.interfaces;

public interface Quackable {
    default void quack() {
        System.out.println("quacking");
    }
}

