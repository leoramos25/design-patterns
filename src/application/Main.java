package application;

import simuduck.Duck;
import simuduck.Hunter;
import simuduck.MallardDuck;
import simuduck.ModelDuck;
import simuduck.flybehavior.FlyRocketPowered;

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
        hunter.callQuack();
    }
}
