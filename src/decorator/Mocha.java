package decorator;

public class Mocha extends CondimentDecorator {
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public BeverageSize getSize() {
    return beverage.getSize();
  }

  @Override
  public double cost() {
    return 0.20 + beverage.cost();
  }
}
