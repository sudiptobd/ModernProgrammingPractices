package lab5.prob2.behaviours.implementations;

import lab5.prob2.behaviours.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
