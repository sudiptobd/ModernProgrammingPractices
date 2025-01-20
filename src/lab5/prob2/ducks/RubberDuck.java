package lab5.prob2.ducks;

import lab5.prob2.behaviours.implementations.CannotFly;
import lab5.prob2.behaviours.implementations.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
