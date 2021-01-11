package strategy.behavior.concret;

import strategy.behavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Não posso voar");
    }
}
