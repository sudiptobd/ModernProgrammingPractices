package lab7.prob4.ducks;

import lab7.prob4.behaviours.implementations.CannotFly;
import lab7.prob4.behaviours.implementations.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }
}
