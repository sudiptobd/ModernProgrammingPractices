package lab7.prob4.ducks;

import lab7.prob4.behaviours.implementations.CannotFly;
import lab7.prob4.behaviours.implementations.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }
}
