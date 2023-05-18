package strategy.simuduck;

import strategy.simuduck.flybehavior.FlyNoWay;
import strategy.simuduck.quackbehavior.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm model duck");
  }
}
