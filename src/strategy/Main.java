package strategy;

import strategy.behavior.concret.FlyRocketPowered;
import strategy.entities.Duck;
import strategy.entities.MallardDuck;
import strategy.entities.ModelDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
