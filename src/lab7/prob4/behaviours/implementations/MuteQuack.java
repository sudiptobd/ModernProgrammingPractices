package lab7.prob4.behaviours.implementations;

import lab7.prob4.behaviours.interfaces.Quackable;

public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
