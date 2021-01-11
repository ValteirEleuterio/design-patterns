package strategy.behavior.concret;

import strategy.behavior.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // não faz nenhum som
    }
}
