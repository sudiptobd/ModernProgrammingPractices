package lab5.prob2.ducks;

import lab5.prob2.behaviours.implementations.FlyWithWings;
import lab5.prob2.behaviours.implementations.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
