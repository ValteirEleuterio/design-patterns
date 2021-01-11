package strategy.behavior.concret;

import strategy.behavior.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("som do pato");
    }
}
