package strategy.behavior.concret;

import strategy.behavior.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Voando com um foguete");
    }
}
