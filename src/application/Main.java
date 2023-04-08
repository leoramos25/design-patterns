package application;

import strategy.simuduck.Duck;
import strategy.simuduck.Hunter;
import strategy.simuduck.MallardDuck;
import strategy.simuduck.ModelDuck;
import strategy.simuduck.flybehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        Hunter hunter = new Hunter("Leonardo");
        hunter.emitFakeQuack();
    }
}
