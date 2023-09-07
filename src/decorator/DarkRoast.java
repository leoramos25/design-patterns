package decorator;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    this.description = "Dark roast coffee";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
