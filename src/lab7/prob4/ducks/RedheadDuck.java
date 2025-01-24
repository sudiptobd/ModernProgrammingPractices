package lab7.prob4.ducks;

import lab7.prob4.behaviours.implementations.FlyWithWings;
import lab7.prob4.behaviours.implementations.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
