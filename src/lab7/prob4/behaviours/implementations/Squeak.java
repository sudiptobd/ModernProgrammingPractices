package lab7.prob4.behaviours.implementations;

import lab7.prob4.behaviours.interfaces.Quackable;

public class Squeak implements Quackable {
    @Override
    public void quack() {
        System.out.println("squeaking");
    }
}
