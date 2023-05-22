package decorator;

public class Whip extends CondimentDecorator {
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public BeverageSize getSize() {
    return beverage.getSize();
  }

  @Override
  public double cost() {
    double cost = beverage.cost();
    return switch (beverage.getSize()) {
      case TALL -> cost + 0.10;
      case GRAND -> cost + 0.15;
      case VENT -> cost + 0.20;
    };
  }
}
