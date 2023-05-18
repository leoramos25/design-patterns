package strategy.simuduck.quackbehavior;

public class FakeQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Hunter used a machine for simulation fake quack");
  }
}
