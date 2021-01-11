package strategy.entities;

import strategy.behavior.concret.FlyWithWings;
import strategy.behavior.concret.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Este é um verdadeiro Mallard duck");
    }
}
