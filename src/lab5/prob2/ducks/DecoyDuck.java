package lab5.prob2.ducks;

import lab5.prob2.behaviours.implementations.CannotFly;
import lab5.prob2.behaviours.implementations.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }
}
