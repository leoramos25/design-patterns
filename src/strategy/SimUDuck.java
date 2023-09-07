package strategy;

import strategy.flybehavior.FlyRocketPowered;

public class SimUDuck {
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
