package strategy.behavior.concret;

import strategy.behavior.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Voando com as asas");
    }
}
