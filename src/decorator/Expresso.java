package decorator;

public class Expresso extends Beverage {
  public Expresso() {
    this.description = "Expresso coffee";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
