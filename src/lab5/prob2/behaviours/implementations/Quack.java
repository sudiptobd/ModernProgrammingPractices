package lab5.prob2.behaviours.implementations;

import lab5.prob2.behaviours.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
