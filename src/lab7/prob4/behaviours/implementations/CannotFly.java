package lab7.prob4.behaviours.implementations;

import lab7.prob4.behaviours.interfaces.Flyable;

public class CannotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
