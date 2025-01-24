package lab7.prob4.ducks;

import lab7.prob4.behaviours.interfaces.Flyable;
import lab7.prob4.behaviours.interfaces.Quackable;

public abstract class Duck implements Flyable, Quackable {
    protected Flyable flyBehavior;
    protected Quackable quackBehavior;

    public void fly() {
        flyBehavior.fly();
    }
    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }
    public void display() {System.out.println("displaying");};
}
