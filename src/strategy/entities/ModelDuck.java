package strategy.entities;

import strategy.behavior.concret.FlyNoWay;
import strategy.behavior.concret.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Eu sou o pato modelo");
    }
}
