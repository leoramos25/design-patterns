package strategy;

import strategy.quackbehavior.FakeQuack;
import strategy.quackbehavior.QuackBehavior;

public class Hunter {
  String name;
  QuackBehavior quackBehavior;

  public Hunter(String name) {
    this.name = name;
    this.quackBehavior = new FakeQuack();
  }

  public void emitFakeQuack() {
    quackBehavior.quack();
  }
}
