package strategy;

import strategy.flybehavior.FlyWithWings;
import strategy.quackbehavior.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard Duck");
  }
}
